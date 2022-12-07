package bontech.bontech.items;

import bontech.bontech.helpers.IntToUnicodeScripts;
import bontech.bontech.materials.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BTBucket extends BucketItem {

    public String atomic_symbol;
    //Make the mass number, and charge NBT data so that they can be changed and stuff
    public int atomic_number;
    public float mass_number;
    public int charge;
    public float density;
    public float strength;
    public float melting_point;
    public float boiling_point;

    public BTBucket(Fluid fluid, Settings settings, Material material) {
        super(fluid, settings);
        this.atomic_symbol = material.atomic_symbol;
        this.atomic_number = material.atomic_number;
        this.mass_number = material.mass_number;
        this.charge = material.charge;
        this.density = material.density;
        this.strength = material.strength;
        this.melting_point = material.melting_point;
        this.boiling_point = material.boiling_point;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(1,  new LiteralText(IntToUnicodeScripts.floatConvertSuperScript(mass_number)
                + IntToUnicodeScripts.convertSubScript(atomic_number) + " " + atomic_symbol + " " + IntToUnicodeScripts.convertSuperScript(charge)));
        tooltip.add(new LiteralText("g/cm³: " + density));
        tooltip.add(new LiteralText("melting: " + melting_point + "°k"));
        tooltip.add(new LiteralText("boiling: " + boiling_point + "°k"));
    }
}

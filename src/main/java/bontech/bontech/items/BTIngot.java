package bontech.bontech.items;

import bontech.bontech.helpers.IntToUnicodeScripts;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BTIngot extends Item {

    public String atomic_symbol;
    //Make the mass number, and charge NBT data so that they can be changed and stuff
    public int atomic_number;
    public int mass_number;
    public int charge;

    public BTIngot(Settings settings, String atomic_symbol, int atomic_number, int mass_number, int charge) {
        super(settings);
        this.atomic_symbol = atomic_symbol;
        this.atomic_number = atomic_number;
        this.mass_number = mass_number;
        this.charge = charge;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(1, Text.literal(IntToUnicodeScripts.convertSuperScript(mass_number) + IntToUnicodeScripts.convertSubScript(atomic_number) + " " + atomic_symbol + " " + IntToUnicodeScripts.convertSuperScript(charge)));
    }
}

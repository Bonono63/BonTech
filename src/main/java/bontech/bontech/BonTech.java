package bontech.bontech;

import bontech.bontech.blocks.BonTechBlocks;
import bontech.bontech.items.BonTechItems;
import bontech.bontech.items.groups.BonTechItemGroups;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class BonTech implements ModInitializer {

    public static final String MOD_ID = "bontech";

    public static Identifier identifier(String id) {return new Identifier(MOD_ID, id);};

    @Override
    public void onInitialize() {
        BonTechItems.init();
        BonTechBlocks.init();
        BonTechItemGroups.init();
    }
}

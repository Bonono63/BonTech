package bontech.bontech;

import bontech.bontech.blocks.BonTechBlocks;
import bontech.bontech.blocks.entities.BonTechBlockEntity;
import bontech.bontech.config.BonTechConfiguration;
import bontech.bontech.config.Config;
import bontech.bontech.items.BonTechItems;
import bontech.bontech.items.groups.BonTechItemGroups;
import bontech.bontech.materials.MaterialRegistration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BonTech implements ModInitializer {

    public static final String MOD_ID = "bontech";
    public static final String DISPLAY_NAME = "BonTech";
    public static final Logger LOGGER = LoggerFactory.getLogger("BonTech");
    public static final Config CONFIG = BonTechConfiguration.read();
    public static Identifier identifier(String id) { return new Identifier(MOD_ID, id); }

    @Override
    public void onInitialize() {
        BonTechConfiguration.init();

        MaterialRegistration.init();

        BonTechItems.init();
        BonTechBlocks.init();
        BonTechBlockEntity.init();
        BonTechItemGroups.init();
    }
}

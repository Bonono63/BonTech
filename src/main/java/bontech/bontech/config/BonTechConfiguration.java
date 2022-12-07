package bontech.bontech.config;

import bontech.bontech.BonTech;
import bontech.bontech.helpers.HexPaddingRemover;
import bontech.bontech.materials.Material;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BonTechConfiguration {

    private static final Path CONFIG_PATH = FabricLoader.getInstance().getConfigDir();
    private static final String MOD_FOLDER = "bontech/";

    public static void init() {
        //A check for an initial configuration file needs to be made, if one isn't present it needs to be generated somehow or a file needs to be downloaded from somewhere
    }

    /*
    * Used to read the configuration in the main entrypoint, server side and client side.
    * This is and index of every single Material and Material group
    * */
    public static Config read() {
        //get the configuration directory and it's contents
        File directory = CONFIG_PATH.resolve(MOD_FOLDER).toFile();
        String[] contents = directory.list();

        List<Material> materials = new ArrayList<>();

        assert contents != null;
        for (String name : contents) {

            BonTech.LOGGER.info(name);
            if (Objects.equals(name, "ignore")) {
                break;
            }

            //Iterate through the all the files to prepare the configuration
            File file = CONFIG_PATH.resolve(MOD_FOLDER+name).toFile();
            //BonTech.LOGGER.info(file.getAbsolutePath());

            try {
                JsonElement fileElement = JsonParser.parseReader(new FileReader(file));
                JsonObject fileObject = fileElement.getAsJsonObject();

                JsonArray materialArray = fileObject.get("materials").getAsJsonArray();
                //Iterates through every entry in the materials file
                for ( JsonElement materialElement : materialArray)
                {
                    JsonObject materialElementObject = materialElement.getAsJsonObject();

                    //extract data from json fields to memory
                    String display_name = materialElementObject.get("display_name").getAsString();
                    String id = materialElementObject.get("id").getAsString();
                    String atomic_symbol = materialElementObject.get("atomic_symbol").getAsString();
                    float mass_number = materialElementObject.get("mass_number").getAsFloat();
                    int atomic_number = materialElementObject.get("atomic_number").getAsInt();
                    int charge = materialElementObject.get("charge").getAsInt();
                    float density = materialElementObject.get("density").getAsFloat();
                    float strength = materialElementObject.get("strength").getAsFloat();
                    float melting_point = materialElementObject.get("melting_point").getAsFloat();
                    float boiling_point = materialElementObject.get("boiling_point").getAsFloat();

                    String _color = materialElementObject.get("color").getAsString();

                    //BonTech.LOGGER.info(_color);
                    _color = HexPaddingRemover.remover(_color);
                    //BonTech.LOGGER.info(_color);

                    //All color values need to be 16 bit (hexadecimal) values to be accepted
                    int color = Integer.parseInt(_color, 16);

                    JsonArray suffixes = materialElementObject.get("suffixes").getAsJsonArray();

                    for ( JsonElement suffix : suffixes ) {

                        StringBuilder current = new StringBuilder(suffix.getAsString());
                        String currentWithoutUnderscore = suffix.getAsString();

                        // Inserts an underscore if the current suffix isn't empty
                        if (!current.isEmpty() && current.charAt(0) != '_') {
                            current.insert(0,"_");
                        }

                        Material out = new Material(display_name, id+current, atomic_symbol, mass_number, atomic_number, charge, density, strength, melting_point, boiling_point, color, currentWithoutUnderscore);
                        BonTech.LOGGER.info(out.toString());

                        materials.add(out);
                    }
                }
            }
            catch (FileNotFoundException ignored){
                BonTech.LOGGER.info("Configuration file not found.");
            }
        }
        return new Config(materials);
    }

    public static List<String> getIngored() {
        File file = CONFIG_PATH.resolve(MOD_FOLDER+ "ignore.json").toFile();

        List<String> ignored_types = new ArrayList<>();

        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(file));
            JsonObject fileObject = fileElement.getAsJsonObject();

            JsonArray ignores = fileObject.get("ignore").getAsJsonArray();
            
            for ( JsonElement element : ignores ) {
                String temp = element.getAsString();
                ignored_types.add(temp);
            }
        } catch (FileNotFoundException e) {
            BonTech.LOGGER.info("Could not find a ignore configuration.");
            throw new RuntimeException(e);
        }

        return ignored_types;
    }
}

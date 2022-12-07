package bontech.bontech.config;

import bontech.bontech.materials.Material;

import java.util.List;

public class Config {

    List<Material> materialGroups;

    public Config(List<Material> materialGroups) {
        this.materialGroups = materialGroups;
    }

    public List<Material> getMaterials() {
        return materialGroups;
    }
}

package bontech.bontech.config;

import bontech.bontech.materials.Material;

import java.util.List;

public class MaterialGroup {

    private List<Material> materials;
    private List<String> types;

    public MaterialGroup(List<Material> materials, List<String> types) {
        this.materials = materials;
        this.types = types;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public List<String> getTypes() {
        return types;
    }
}

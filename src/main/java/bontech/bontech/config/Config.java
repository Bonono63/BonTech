package bontech.bontech.config;

import java.util.List;

public class Config {

    List<MaterialGroup> materialGroups;

    public Config(List<MaterialGroup> materialGroups) {
        this.materialGroups = materialGroups;
    }

    public List<MaterialGroup> getMaterialGroups() {
        return materialGroups;
    }
}

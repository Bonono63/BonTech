package bontech.bontech.materials;

public class Material {
    public String DisplayName;
    public String id;
    public String atomic_symbol;
    //density per kilogram
    public float density;
    //tensile strength
    public int strength;
    public int melting_point;
    public int boiling_point;

    public Material(String displayName, String id, String atomic_symbol , float density, int strength, int melting_point, int boiling_point){
        this.DisplayName = displayName;
        this.id = id;
        this.atomic_symbol = atomic_symbol;
        this.density = density;
        this.strength = strength;
        this.melting_point = melting_point;
        this.boiling_point = boiling_point;
    }
}

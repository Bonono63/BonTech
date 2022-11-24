package bontech.bontech.materials;

public class Material {
    public String DisplayName;
    public String id;
    public String atomic_symbol;
    public float mass_number;
    public int atomic_number;
    public int charge;
    //density per kilogram
    public float density;
    //tensile strength
    public float strength;
    public float melting_point;
    public float boiling_point;
    //hexadecimal color provider
    public int color;

    public Material(String displayName, String id, String atomic_symbol, float mass_number, int atomic_number, int charge, float density, float strength, float melting_point, float boiling_point, int color){
        this.DisplayName = displayName;
        this.id = id;
        this.atomic_symbol = atomic_symbol;
        this.mass_number = mass_number;
        this.atomic_number = atomic_number;
        this.charge = charge;
        this.density = density;
        this.strength = strength;
        this.melting_point = melting_point;
        this.boiling_point = boiling_point;
        this.color = color;
    }

    public static Material EMPTY = new Material("empty", "empty", "empty", 0,0,0,0,0,0,0,0);

    @Override
    public String toString() {
        return "Display: " + DisplayName + " id: " + id + " Symbol: " + atomic_symbol + " Mass: " + mass_number + " Number: "+ atomic_number + " Charge: " + charge + " Density: " + density + " g/cm^3 Moh: " + strength + " Melting: " + melting_point + " Boiling: " + boiling_point + " Color: " + color;
    }
}

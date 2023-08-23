package example;

public class Veihcle {
    String envrioment;  // Terrestres, aéreo, subaquático...
    float weight;       // Peso
    String model;       // Modelo
    String brand;       // Marca
    int year;           // Ano

    public Veihcle(String env, float w, String mod, String b, int y) { 
        this.envrioment = env;
        this.weight = w;
        this.model = mod;
        this.brand = b;
        this.year = y;
    }
}

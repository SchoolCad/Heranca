package example;

public class Boat extends Veihcle{

    int motor;          // Tempo do motor
    String motorBrand;  // Marca do motor
    int potence;        // Potência
    String material;    // Material feito
    
    public Boat(String meio, float peso, String modelo, String marca, int ano,
                int tempo, String marca_motor, int potencia, String material) {
        super(meio, peso, modelo, marca, ano); 
        this.motor = tempo;
        this.motorBrand = marca_motor;
        this.potence = potencia;
        this.material = material;
    }

}

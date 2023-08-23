package example;

public class Motorcycle extends Veihcle {
    
    int km;             // Quilometragem
    int displacement;   // Cilindrada
    String tireMark;    // Marca do Pneu

    public Motorcycle(String meio, float peso, String modelo, String marca,
                     int ano, int quilometragem, int cilindrada, String marca_pneu) {

        super(meio, peso, modelo, marca, ano); 
        this.km = quilometragem;
        this.displacement = cilindrada;
        this.tireMark = marca_pneu;
    }

}

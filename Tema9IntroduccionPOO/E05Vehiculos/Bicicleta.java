package Tema9IntroduccionPOO.E05Vehiculos;

public class Bicicleta extends Vehiculo {
    // atributos estáticos
    public static int bicicletasCreadas = 0;

    // constructor
    public Bicicleta() {
        super();
        bicicletasCreadas++;
    }

    /**
     * Simula la acción de hacer un caballito con la bicicleta.
     * Esto se refiere a levantar la rueda delantera del suelo
     * mientras se mantiene el equilibrio sobre la rueda trasera.
     */
    public void hacerCaballito() {
        System.out.println("Hacemos caballito");
    }

}

package Tema9IntroduccionPOO.E05Vehiculos;

public class Coche extends Vehiculo {
    // atributos estáticos
    public static int cochesCreados = 0;

    // constructor
    public Coche() {
        super();
        cochesCreados++;
    }

    /**
     * Quema rueda.
     */
    public void quemarRueda() {
        System.out.println( "Quemamos rueda a lo Toretto");
    }
}

package Tema9IntroduccionPOO.E05Vehiculos;

public class Vehiculo {
    // atributos de clase (estáticos)
    public static int vehiculosCreados = 0;
    public static int kilometrosTotales = 0;

    // atributos de instancia (dinámicos)
    public int kilometrosRecorridos = 0;

    // constructor
    public Vehiculo() {
        vehiculosCreados++;
    }

    // metodos
    public void avanzar(int km) {
        kilometrosRecorridos += km;
        kilometrosTotales += km;
    }
}

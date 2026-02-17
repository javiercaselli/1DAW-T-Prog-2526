package Tema9IntroduccionPOO.E04Fracciones;

public class Fraccion {
    // atributos
    private int numerador;
    private int denominador;

    // constructor
    Fraccion(int numerador, int denominador) {
        if (denominador == 0) throw new IllegalArgumentException("No se puede crear una fraccion con denominador 0");
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // metodos
    public Fraccion invertir() {
        return new Fraccion(denominador, numerador);
    }

    public Fraccion multiplicar(Fraccion otra) {
        return new Fraccion(numerador * otra.numerador, denominador * otra.denominador);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }

}

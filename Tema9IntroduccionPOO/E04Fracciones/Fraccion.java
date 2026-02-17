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

    /**
     * Devuelve la fraccion inversa de la que se llama.
     *
     * @return La fraccion inversa
     */
    public Fraccion invertir() {
        return new Fraccion(denominador, numerador);
    }

    /**
     * Devuelve la multiplicacion de dos fracciones.
     * @param otra La fraccion con la que se va a multiplicar.
     * @return La multiplicacion de las dos fracciones.
     */
    public Fraccion multiplicar(Fraccion otra) {
        return (new Fraccion(numerador * otra.numerador, denominador * otra.denominador)).simplificar();
    }

    /**
     * Devuelve la division de dos fracciones.
     * @param otra La fraccion con la que se va a dividir.
     * @return La division de las dos fracciones.
     */
    public Fraccion dividir(Fraccion otra) {
        return (new Fraccion(numerador * otra.denominador, denominador * otra.numerador)).simplificar();
    }

    /**
     * Devuelve la suma de dos fracciones.
     * @param otra La fraccion con la que se va a sumar.
     * @return La suma de las dos fracciones.
     */
    public Fraccion sumar(Fraccion otra) {
        Fraccion temp = new Fraccion((numerador * otra.denominador) + (otra.numerador * denominador), denominador * otra.denominador);
        return temp.simplificar();
    }

    /**
     * Devuelve la fraccion simplificada.
     * @return La fraccion simplificada.
     */
    public Fraccion simplificar() {
        int mcd = MCD(numerador, denominador);
        return new Fraccion(numerador / mcd, denominador / mcd);
    }

    /**
     * Devuelve el MCD de dos numeros enteros.
     * @param a
     * @param b
     * @return El MCD de a y b.
     */
    private int MCD(int a, int b) {
        while (b != 0) {
            int aux = b;
            b = a % b;
            a = aux;
        }
        return a;
    }

    /**
     * Devuelve el MCD de dos numeros enteros recursivamente.
     * @param a
     * @param b
     * @return El MCD de a y b.
     */
    private int MCDRecursivo(int a, int b) {
        return b == 0 ? a : MCDRecursivo(b, a % b);
    }

    /**
     * Devuelve una cadena con el formato "numerador/denominador".
     * @return La cadena con el formato "numerador/denominador".
     */
    public String toString() {
        return numerador + "/" + denominador;
    }

}

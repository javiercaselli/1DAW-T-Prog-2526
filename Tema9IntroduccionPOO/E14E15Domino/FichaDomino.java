package Tema9IntroduccionPOO.E14E15Domino;

public class FichaDomino {
    // Atributos
    private int valor1;
    private int valor2;

    // Constructor
    public FichaDomino(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    // Métodos

    /**
     * Método que voltea una ficha de domino
     * @return ficha de dominó vuelta
     */
    public FichaDomino voltea() {
        int aux = this.valor1;
        this.valor1 = this.valor2;
        this.valor2 = aux;
        return this;
    }

    /**
     * Método que comprueba si dos fichas de dominó encajan.
     *
     * Habrá que "jugar" con el voltea para comprobar todas las posibilidades
     *
     * @param otraFicha
     * @return booleano con el resultado de la comprobación
     */
    public boolean encaja(FichaDomino otraFicha) {
        return (this.valor1 == otraFicha.valor1 || this.valor1 == otraFicha.valor2
        || this.valor2 == otraFicha.valor1 || this.valor2 == otraFicha.valor2);
    }

    /**
     * Método que comprueba si la ficha actual en su posición actual encaja con la ficha que se le pasa como parámetro
     *
     * En caso de que sea necesario, se voltea la ficha que se pasa como parámetro
     *
     * @param otraFicha
     * @return booleano con el resultado de la comprobación
     */
    public boolean encajaSinVoltear(FichaDomino otraFicha) {
        if (this.valor2 == otraFicha.valor1) {
            return true;
        } else if (this.valor2 == otraFicha.valor2) {
            otraFicha = otraFicha.voltea();
            return true;
        }
        return false;
    }

    // Getter y Setter
    public int getValor1() {
        return valor1;
    }
    public int getValor2() {
        return valor2;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    // toString
    @Override
    public String toString() {
        return "[" + valor1 + "|" + valor2 + "]";
    }
}

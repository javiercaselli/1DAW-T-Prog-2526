package Tema9IntroduccionPOO.E09Terminal;

public class Terminal {
    // Atributos
    private String numero;
    private int tiempo;

    // Constructor
    public Terminal(String numero) {
        this.numero = numero;
        this.tiempo = 0;
    }

    // Métodos
    public void llama(Terminal terminal, int tiempo) {
        this.tiempo += tiempo;
        terminal.tiempo += tiempo;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "No " + numero + " - " + tiempo + " de conversación";
    }
}

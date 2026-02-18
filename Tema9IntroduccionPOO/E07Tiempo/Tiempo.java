package Tema9IntroduccionPOO.E07Tiempo;

public class Tiempo {
    // atributos de instancia
    private int hora;
    private int minuto;
    private int segundo;

    // constructor
    Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // métodos
    public Tiempo sumar(Tiempo otro) {
        // Sumamos cada unidad de tiempo
        int horas = hora + otro.hora;
        int minutos = minuto + otro.minuto;
        int segundos = segundo + otro.segundo;

        // Compueba si la suma de segundos es mayor que 60
        if (segundos / 60 > 0) {
            minutos += segundos / 60;
            segundos %= 60;
        }

        // Compruea si la suna de minutos es mayor que 60
        if (minutos / 60 > 0) {
            horas += minutos / 60;
            minutos %= 60;
        }

        return new Tiempo(horas, minutos, segundos);
    }

    public Tiempo restar(Tiempo otro) {
        return new Tiempo(hora - otro.hora, minuto - otro.minuto, segundo - otro.segundo);
    }

    // to String
    public String toString() {
        // return String.format("%02d:%02d:%02d", hora, minuto, segundo);
        return hora + "h " + minuto + "m " + segundo + "s";
    }
}

package Tema9IntroduccionPOO.E07Tiempo;

public class TiempoMain {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(0, 0, 3600);
        Tiempo t2 = new Tiempo(0, 30, 27);

        System.out.println(t1 + " + " + t2 + " = " + t1.sumar(t2));
    }
}

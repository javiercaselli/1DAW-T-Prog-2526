package Tema9IntroduccionPOO.ejemploPolimorfismoAnimales;

public class MainEjemploPolimorfismoAnimales {
    public static void main(String[] args) {

        Perro perro = new Perro();
        Murcielago murcielago = new Murcielago();

        Insecto insecto = new Insecto();
        Abeja abeja = new Abeja();

        perro.comer("pienso");
        abeja.comer("miel");
        murcielago.comer("insectos");

        perro.desplazar(100);
        abeja.desplazar(50);
        murcielago.desplazar(300);

        perro.sonido();
        murcielago.sonido();
        Gato gato = new Gato();
        gato.sonido();
        gato.comer("Hola");



    }

}
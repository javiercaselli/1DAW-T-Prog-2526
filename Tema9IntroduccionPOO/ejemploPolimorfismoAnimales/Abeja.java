package Tema9IntroduccionPOO.ejemploPolimorfismoAnimales;

public class Abeja extends Insecto {
    @Override
    public void desplazar(int metros) {
        System.out.println("Vuelo por el aire " + metros + " metros");
    }

}

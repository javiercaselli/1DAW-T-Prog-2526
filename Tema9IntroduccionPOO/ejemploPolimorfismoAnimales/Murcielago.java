package Tema9IntroduccionPOO.ejemploPolimorfismoAnimales;

public class Murcielago extends Mamifero {

    @Override
    public void desplazar(int metros) {
        System.out.println("Vuelo por el aire " + metros + " metros");
    }
    
    @Override
    public void sonido() {
        System.out.println("Emito ultrasonidos y tu limitado oído humano no los percibe");
    }

}

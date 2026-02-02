package Tema9IntroduccionPOO.ejemploPolimorfismoAnimales;

public class Mamifero extends Animal {

    public void criar(int camada) {
        System.out.println("Estoy criando una camada de " + camada + " cachorros");

        this.peso = 40;
    }

    public void sonido() {
        System.out.println("Soy un mamífero genérico y no emito ningún sonido en particular");
    }
}

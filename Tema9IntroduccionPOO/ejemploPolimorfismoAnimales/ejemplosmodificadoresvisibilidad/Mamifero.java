package Tema9IntroduccionPOO.ejemploPolimorfismoAnimales.ejemplosmodificadoresvisibilidad;

import Tema9IntroduccionPOO.ejemploPolimorfismoAnimales.Animal;

public class Mamifero extends Animal {

    public void criar(int camada) {
        System.out.println("Estoy criando una camada de " + camada + " cachorros");

    }

    public void sonido() {
        System.out.println("Soy un mamífero genérico y no emito ningún sonido en particular");
    }
}

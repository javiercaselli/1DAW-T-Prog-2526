package Tema9IntroduccionPOO.E04Fracciones;

public class MainFraccion {

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(4, 3);

        System.out.println(f1);
        System.out.println(f1.invertir());
        System.out.println(f1.multiplicar(f2));
    }

}

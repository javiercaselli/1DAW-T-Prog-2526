package Tema9IntroduccionPOO.E04Fracciones;

public class MainFraccion {

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(-7, 8);
        Fraccion f2 = new Fraccion(5, 1);


        System.out.println(f1 + " * " + f2 + " = " + f1.multiplicar(f2));
        System.out.println(f1 + " ^-1 = " + f1.invertir());

        Fraccion f3 = new Fraccion(3, 5);
        System.out.println(f1 + " * " + f3 + " = " + f1.multiplicar(f3));

        System.out.println(f1 + " + " + f3 + " = " + f1.sumar(f3));

        // Ejemplos con simplificación
        Fraccion f4 = new Fraccion(18, 8);
        Fraccion f5 = new Fraccion(26, 14);

        System.out.println();
        System.out.println(f4 + " + " + f5 + " = " + f4.sumar(f5));
        System.out.println(f4 + " * " + f5 + " = " + f4.multiplicar(f5));

    }

}

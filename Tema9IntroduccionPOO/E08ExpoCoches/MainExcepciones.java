package Tema9IntroduccionPOO.E08ExpoCoches;

import java.util.Scanner;

public class MainExcepciones {
    public static void main(String[] args) {
        try {
            double numero1;
            double numero2;
            Scanner s = new Scanner(System.in);
            System.out.print("Introduzca el primer número: ");
            numero1 = Double.parseDouble(s.nextLine());
            System.out.print("Introduzca el segundo número: ");
            numero2 = Double.parseDouble(s.nextLine());
            System.out.println("La media es " + (numero1 + numero2) / 2);
        } catch (Exception e) {
            System.out.println("Error: Debe ingresar un numero válido");
        } finally {
            System.out.println("Gracias por usar este programa");
        }
    }
}

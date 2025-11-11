import java.util.Scanner;

public class T05E15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int numero1 = sc.nextInt();
        System.out.print("Introduzca un número entero distinto al anterior: ");
        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            // Comprueba si son iguales
            System.out.println("Números no válidos, deben ser distintos");
        } else {
            if (numero2 > numero1) {
                // El número 1 siempre será el mayor, si no es así, lo intercambiamos
                int aux = numero1;
                numero1 = numero2;
                numero2 = aux;
            }

            // Vamos sumando de 7 en 7 para llegar del número 2 al número 1
            while (numero1 >= numero2) {
                System.out.print(numero2 + " ");
                numero2 += 7;
            }
        } 


        sc.close();
    }
}

import java.util.Scanner;

public class T05E09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        int primero = 0;
        int segundo = 1;

        if (numero == 1) {
            // Imprime los dos primeros
            System.out.print(primero);
        } else if (numero > 1) {
            // Imprime los dos primeros
            System.out.print(primero + " " + segundo + " ");
            while (numero > 2) {
                // calculamos el siguiente dígito de la serie
                int siguiente = primero + segundo;
                primero = segundo;
                segundo = siguiente;

                // imprimimos
                System.out.print(siguiente + " ");

                // decrementamos contador
                numero--;
            }
        }

        sc.close();
    }
}

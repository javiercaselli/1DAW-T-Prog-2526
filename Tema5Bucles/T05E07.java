import java.util.Scanner;

public class T05E07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        System.out.println("Vaya introduciendo números:");
        int numero = sc.nextInt();

        while (numero >= 0) {
            suma += numero;
            contador++;
            numero = sc.nextInt();
        }

        int media = suma / contador;

        System.out.println("La media de los números introducidos es " + media);

        sc.close();
    }
}

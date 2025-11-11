import java.util.Scanner;

public class T05E06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Itroduzca un número entero: ");
        int numero = sc.nextInt();

        // Para averiguar cuántos dígitos tiene divido entre 10 hasta que la división de cero
        int digitos = 0;
        do {
            numero /= 10;
            digitos++;
        } while (numero != 0);

        System.out.println("Tiene " + digitos + " digitos");
        sc.close();
    }
}

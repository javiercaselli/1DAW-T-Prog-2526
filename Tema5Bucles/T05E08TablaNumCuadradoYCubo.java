import java.util.Scanner;

public class T05E08TablaNumCuadradoYCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pide un número por teclado
        System.out.print("Introduzca un número: ");
        int numero = sc.nextInt();

        // Cabecera de la tabla
        System.out.println("  n  |   n2   |    n3    ");
        System.out.println("-------------------------");

        // Genera tabla con los 4 siguientes números en la 1ª col., los cuadrados en la 2ª y los cubos en la 3ª
        for (int i = 0; i <= 4; i++) {
            int numeroFila = numero + i;
            int cuadrado = numeroFila * numeroFila;
            int cubo = cuadrado * numeroFila;
            //System.out.println("  " + numeroFila + "  |   " + cuadrado + "   |    " + cubo);
            System.out.printf("%3d%3s%5d%4s%6d\n", numeroFila,"|", cuadrado, "|", cubo);
        }

        sc.close();
    }
}

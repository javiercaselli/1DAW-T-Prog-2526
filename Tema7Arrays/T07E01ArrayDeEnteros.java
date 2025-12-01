package Tema7Arrays;

public class T07E01ArrayDeEnteros {
    public static void main(String[] args) {
        // Declaración del array de 12 números enteros
        int[] num = new int[12];

        // Asignación de valores
        num[0] = 29;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        // Imprime en pantalla el contenido del array
        for (int numero : num) {
            System.out.println(numero);
        }
    }
}

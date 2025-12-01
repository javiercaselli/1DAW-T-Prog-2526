package Tema7Arrays;

public class T07E01ArrayDeCaracteres {
    public static void main(String[] args) {
        // Declaración del array de 10 caracteres
        String[] simbolo = new String[10];

        // Asignación de valores
        simbolo[0] = "a";
        simbolo[1] = "x";
        simbolo[4] = "@";
        simbolo[6] = " ";
        simbolo[7] = "+";
        simbolo[8] = "Q";

        // Imprime en pantalla el contenido del array
        for (String caracter : simbolo) {
            System.out.println(caracter);
        }
    }
}

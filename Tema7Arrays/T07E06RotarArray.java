package Tema7Arrays;

import java.util.Random;

public class T07E06RotarArray {
    public static void main(String[] args) {
        // Declaración de los Arrays
        int[] numeros = new int[15];

        // Inicializa Random
        Random rand = new Random();

        // Genera 20 números aleatorios y los almacena en el array correspondiente
        System.out.println("Lista original:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(0, 100);
            System.out.println(numeros[i]);
        }

        // Rotamos el array
        
        System.out.println("Lista rotada:");
        int aux1 = numeros[1];
        int aux2 = numeros[0];
        for (int i = 0; i < (numeros.length - 1); i++) {
            if (i % 2 == 0) {
                aux1 = numeros[i+1];
                numeros[i+1] = aux2;
            } else {
                aux2 = numeros[i+1];
                numeros[i+1] = aux1;
            }
        }
        
        // Rotamos la última posición del array, el último elemento pasa a ser el primero
        numeros[0] = (numeros.length % 2 == 0) ? aux1 : aux2; 

        // Imprime resultados
        for (int num : numeros) System.out.println(num);

    }
}

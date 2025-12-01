package Tema7Arrays;

import java.util.Random;

public class T07E04NumRandomCuadradoYCubo {
    public static void main(String[] args) {
        // Declaración de los Arrays
        int[] numsRandom = new int[20];
        int[] cuadrados = new int[20];
        int[] cubos = new int[20];

        // Inicializa Random
        Random rand = new Random();

        // Genera 20 números aleatorios y los almacena en el array correspondiente
        for (int i = 0; i < numsRandom.length; i++) {
            numsRandom[i] = rand.nextInt(0, 100);
            cuadrados[i] = numsRandom[i] * numsRandom[i];
            cubos[i] = cuadrados[i] * numsRandom[i];
        }


        // Imprime tabla
        // Cabecera de la tabla
        System.out.println("  n  |   n2   |    n3    ");
        System.out.println("-------------------------");

        for (int i = 0; i < cubos.length; i++) {
            System.out.printf("%3d%3s%5d%4s%6d\n", numsRandom[i], "|", cuadrados[i], "|", cubos[i]);
        }

    }
}

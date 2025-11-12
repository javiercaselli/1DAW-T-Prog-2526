package Tema6Aleatorios;

import java.util.Random;

public class EjemplosRandom {
    public static void main(String[] args) {
        // Crear una instancia de Random
        Random rand = new Random();

        // Aleatorio entre [0, 1)
        double aleatorioDouble = rand.nextDouble(0,1);
        System.out.println(aleatorioDouble);

        // Aleatorio entre [0, 1)
        int aleatorio = rand.nextInt(0,1);
        System.out.println(aleatorio);

        // Aleatorio entre [0, max)
        int max = 10;
        aleatorio = rand.nextInt(0, max);
        System.out.println(aleatorio);

        // Aleatorio entre [0, max]
        aleatorio = rand.nextInt(0, max + 1);
        System.out.println(aleatorio);

        // Aleatorio entre (min, max]
        int min = 3;
        aleatorio = rand.nextInt(min + 1, max + 1);
        System.out.println(aleatorio);
      
        // Aleatorio entre [min, max]
        aleatorio = rand.nextInt(min, max + 1);
        System.out.println(aleatorio);
        
        System.out.println(2^3);
    }
}

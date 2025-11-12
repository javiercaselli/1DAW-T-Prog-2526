package Tema6Aleatorios;

public class EjemplosMathRandom {
    public static void main(String[] args) {
        
        // Aleatorio entre [0, 1)
        double aleatorioDouble = Math.random();
        System.out.println(aleatorioDouble);

        // Aleatorio entre [0, 1)
        int aleatorio = (int) Math.random();
        System.out.println(aleatorio);

        // Aleatorio entre [0, max)
        int max = 10;
        aleatorio = (int) (Math.random() * max);
        System.out.println(aleatorio);

        // Aleatorio entre [0, max]
        aleatorio = (int) (Math.random() * (max + 1));
        System.out.println(aleatorio);

        // Aleatorio entre (min, max]
        int min = 3;
        aleatorio = (int) (Math.random() * (max - min)) + min;
        System.out.println(aleatorio);
      
        // Aleatorio entre [min, max]
        aleatorio = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(aleatorio);
    }
}

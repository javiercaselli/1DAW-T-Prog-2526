package Tema9IntroduccionPOO.E14E15Domino;

import java.util.Random;

public class MainE15 {
    public static void main(String[] args) {
        FichaDomino[] fichas = new FichaDomino[8];

        // Generamos 8 fichas aleatorias
        Random random = new Random();

        for (int i = 0; i < fichas.length; i++) {
            FichaDomino ficha = new FichaDomino(random.nextInt(0, 7), random.nextInt(0, 7));
            if (i != 0) {
                while (!fichas[i-1].encajaSinVoltear(ficha)) {
                    ficha = new FichaDomino(random.nextInt(0, 7), random.nextInt(0, 7));
                }
            }
            fichas[i] = ficha;
            System.out.print(ficha);
        }

        System.out.println();
    }


}

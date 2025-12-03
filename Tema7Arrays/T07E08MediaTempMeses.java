package Tema7Arrays;

import java.util.Scanner;

public class T07E08MediaTempMeses {
    public static void main(String[] args) {
        // Array para almacenar las temperaturas
        int[] tempMedias = new int[12];

        // Array con los meses
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Lee temperaturas medias de teclado
        for (int i = 0; i < tempMedias.length; i++) {
            System.out.print("Introduzca la temperatura media de " + meses[i] + ": ");
            tempMedias[i] = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < tempMedias.length; i++) {
            String barra = "";
            for (int j = 0; j < tempMedias[i]; j++) {
                barra += "\u25a0";
            }
            System.out.printf("%12s |%s %sºC\n", meses[i], barra, tempMedias[i]);
        }


        // Cierra scanner
        sc.close();
    }
}

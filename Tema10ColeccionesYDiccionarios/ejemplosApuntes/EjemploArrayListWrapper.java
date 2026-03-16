package Tema10ColeccionesYDiccionarios.ejemplosApuntes;

import java.util.ArrayList;
import java.util.Collections;

public class EjemploArrayListWrapper {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Mostramos el total de elementos de la lista
        System.out.println("Número de elementos: " + numeros.size());

        numeros.add(7);
        numeros.add(2);
        numeros.add(-45);
        numeros.add(18);
        numeros.add(0);
        numeros.add(-9);
        numeros.add(53244);

        for (int i :  numeros) {
            System.out.printf("%d ", i);
        }

        Collections.shuffle(numeros);
        System.out.println();
        for (int i :  numeros) {
            System.out.printf("%d ", i);
        }

        Collections.reverse(numeros);
        System.out.println();
        for (int i :  numeros) {
            System.out.printf("%d ", i);
        }

        Collections.sort(numeros);
        System.out.println();
        for (int i :  numeros) {
            System.out.printf("%d ", i);
        }
    }
}

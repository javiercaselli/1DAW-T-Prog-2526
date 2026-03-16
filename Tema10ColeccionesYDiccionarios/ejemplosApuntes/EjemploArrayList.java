package Tema10ColeccionesYDiccionarios.ejemplosApuntes;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();

        // Mostramos el total de elementos de la lista
        System.out.println("Número de elementos: " + colores.size());

        colores.add("Red");
        colores.add("Blue");
        colores.add("Green");
        colores.add("Orange");
        colores.add("Violet");
        colores.add("Pink");
        colores.add("Purple");

        System.out.println("Número de elementos: " + colores.size());

        // Mostramos elementos por posición
        System.out.println("Elemento en la posición 0: " + colores.get(0));
        System.out.println("Elemento en la posición 2: " + colores.get(2));
        System.out.println("Elemento en la posición 6: " + colores.get(6));

        colores.set(colores.indexOf("Purple"), "Cyan");

        // Mostramos elementos por posición
        System.out.println("Elemento en la posición 0: " + colores.get(0));
        System.out.println("Elemento en la posición 2: " + colores.get(2));
        System.out.println("Elemento en la posición 6: " + colores.get(6));


    }
}

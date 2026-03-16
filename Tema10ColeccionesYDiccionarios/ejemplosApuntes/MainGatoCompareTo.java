package Tema10ColeccionesYDiccionarios.ejemplosApuntes;

import java.util.ArrayList;
import java.util.Collections;

public class MainGatoCompareTo {
    public static void main(String[] args) {
        GatoCompareTo gato1 = new GatoCompareTo("Felix", "Callejero", "Macho", 5, 10);
        GatoCompareTo gato2 = new GatoCompareTo("Duquesa", "Persa", "Hembra", 4, 8);
        GatoCompareTo gato3 = new GatoCompareTo("Cheetah", "Maine Coon", "Hembra", 6, 14);

        ArrayList<GatoCompareTo> gatos = new ArrayList<GatoCompareTo>();
        gatos.add(gato1);
        gatos.add(gato2);
        gatos.add(gato3);

        System.out.println("Gatos antes de ordenar: ");
        for (GatoCompareTo gato : gatos) {
            System.out.println(gato.toString());
        }

        Collections.sort(gatos);
        System.out.println("Gatos después de ordenar: ");
        for (GatoCompareTo gato : gatos) {
            System.out.println(gato.toString());
        }
    }
}

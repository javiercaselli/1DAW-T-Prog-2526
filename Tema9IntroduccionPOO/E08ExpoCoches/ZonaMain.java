package Tema9IntroduccionPOO.E08ExpoCoches;

import java.io.PrintStream;
import java.util.Scanner;

public class ZonaMain {
    public static void main(String[] args) {
        // Creamos un objeto Zona para cada una de las zonas de expocoches descritas en el enunciado
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Opcion
        int opcion = 0;

        // Menú
        do {
            System.out.println("EXPOCOCHES MÁLAGA");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Error: Se debe introducir un número entero válido");
                System.out.println("Mensaje de error de la excepción: " + e.getMessage());
                System.out.println();
            }
            switch (opcion) {
                case 1:
                    System.out.println("En la zona principal hay " + principal.getEntradasPorVender());
                    System.out.println("En la zona compra-venta hay " + compraVenta.getEntradasPorVender());
                    System.out.println("En la zona VIP hay " + vip.getEntradasPorVender());
                    break;
                case 2:
                    venderEntradas(principal, compraVenta, vip, sc);
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Error: opción inválida");
            }
        } while (opcion != 3);
    }

    private static void venderEntradas(Zona principal, Zona compraVenta, Zona vip, Scanner sc) {
        // opcion
        int opcion = 0;

        // Menú venta entradas
        System.out.println("1. Principal");
        System.out.println("2. Compra-venta");
        System.out.println("3. VIP");
        System.out.print("Elige una opcion: ");
        int numEntradas = 0;
        try {
            opcion = Integer.parseInt(sc.nextLine());
            System.out.print("¿Cuántas entradas quieres?: ");
            numEntradas = Integer.parseInt(sc.nextLine());
            if (numEntradas < 1) throw new NumberFormatException("Se ha introducido un número de entradas negativo");
        } catch (NumberFormatException e) {
            System.out.println("Error: La opción o el número de entradas deben ser un número entero válido.");
            System.out.println("Mensaje de error de la excepción: " + e.getMessage());
            System.out.println();
        }
        switch (opcion) {
            case 1:
                principal.vender(numEntradas);
                break;
            case 2:
                compraVenta.vender(numEntradas);
                break;
            case 3:
                vip.vender(numEntradas);
                break;
            default:
                System.out.println("Error: Opción errónea");
        }
    }
}

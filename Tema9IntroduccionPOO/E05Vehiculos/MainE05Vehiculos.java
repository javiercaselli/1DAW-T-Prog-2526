package Tema9IntroduccionPOO.E05Vehiculos;

import java.util.Scanner;

public class MainE05Vehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        // Creación de vehículos
        Coche coche = new Coche();
        Bicicleta bici = new Bicicleta();

        // Menú
        do {
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz un caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. ver kiloetraje total");
            System.out.println("8. Salir");
            System.out.print("Elije una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            // Lo implementamos con un switch-case
            int km = 0;
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kilómetros quieres recorre?: ");
                    km = sc.nextInt();
                    sc.nextLine();
                    bici.avanzar(km);
                    break;
                case 2:
                    bici.hacerCaballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos kilómetros quieres recorre?: ");
                    km = sc.nextInt();
                    sc.nextLine();
                    coche.avanzar(km);
                    break;
                case 4:
                    coche.quemarRueda();
                    break;
                case 5:
                    System.out.println(bici.kilometrosRecorridos);
                    break;
                case 6:
                    System.out.println(coche.kilometrosRecorridos);
                    break;
                case 7:
                    System.out.println(Vehiculo.kilometrosTotales);
                    break;
                default:
                    break;
            }
        } while (opcion != 8);
    }
}

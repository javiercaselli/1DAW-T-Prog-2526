package Tema9IntroduccionPOO.E24GestionAlmacenConArrayList;

import Tema9IntroduccionPOO.E22TiendaDiscos.Disco;

import java.util.ArrayList;
import java.util.Scanner;

public class E24MainGestionAlmacen {
    public static void main(String[] args) {
        // Creamos un gestor de almacén
        GestionAlmacen almacen = new GestionAlmacen();

        // Propiedades
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        // Artículos iniciales
        try {
            almacen.alta(new Articulo(1, "Cargador USB-C 100W", 25.0, 35.0, 200));
            almacen.alta(new Articulo(2, "Monitor 32\" 166Hz", 250, 350, 34));
            almacen.alta(new Articulo(3, "iPhone 37 Pro", 1000.0, 1250, 54));
            almacen.alta(new Articulo(27, "Samsung S84", 1200, 1500.45, 32));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        //Menú
        do {
            System.out.println("GESTISIMAL ===================");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de Mercancía");
            System.out.println("6. Salida de Mercancía");
            System.out.println("7. Salir");
            System.out.println();
            System.out.print("Introduzca la opción deseada: ");
            try {
                opcion = sc.nextInt();
                if (opcion < 1 || opcion > 7) {
                    System.out.println("Error: Debe ser un valor entre 1 y 7");
                }
            } catch (Exception e) {
                System.out.println("Error: opción introducida inválida, debe ser un número entero");
            } finally {
                sc.nextLine();
            }
            System.out.println();

            try {
                switch (opcion) {
                    case 1 -> listarArticulos(almacen, sc);
                    case 2 -> altaArticulo(almacen, sc);
                    case 3 -> bajaArticulo(almacen, sc);
                    case 4 -> modificaArticulo(almacen, sc);
                    case 5 -> entradaMercancia(almacen, sc);
                    case 6 -> salidaMercancia(almacen, sc);
                }
            } catch (Exception e) {
                System.out.println("Se ha producido un error: " + e.toString());
            }
            System.out.println("\n");

        } while (opcion != 7);

        sc.close();
    }

    /**
     * Imprimir por pantalla todos los artículos.
     *
     * @param gestionAlmacen
     * @param sc
     */
    private static void listarArticulos(GestionAlmacen gestionAlmacen, Scanner sc) {
        ArrayList<Articulo> listaArticulos = gestionAlmacen.listarArticulos();
        for (Articulo articulo : listaArticulos) {
            System.out.println(articulo);
        }
    }

    private static void altaArticulo(GestionAlmacen almacen, Scanner sc) throws Exception {
        // Artículo
        Articulo articulo = new Articulo();

        System.out.println("Alta de nuevo artículo en el almacén:");
        System.out.println();

        System.out.print("Código: ");
        articulo.setCodigo(Integer.parseInt(sc.nextLine()));

        System.out.print("Descripción: ");
        articulo.setDescripcion(sc.nextLine());

        System.out.print("Precio de compra: ");
        articulo.setPrecioCompra(Double.parseDouble(sc.nextLine()));

        System.out.print("Precio de venta: ");
        articulo.setPrecioVenta(Double.parseDouble(sc.nextLine()));

        System.out.print("Stock inicial: ");
        articulo.setStock(Integer.parseInt(sc.nextLine()));

        // Insertar disco en la tienda
        almacen.alta(articulo);

        System.out.println("Artículo dado del alta correctamente");
    }


    private static void bajaArticulo(GestionAlmacen gestionAlmacen, Scanner sc) throws Exception {
        // Disco
        Articulo articulo = new Articulo();

        System.out.println("Baja de artículo del almacén:");
        System.out.println();

        System.out.print("Código: ");
        articulo.setCodigo(Integer.parseInt(sc.nextLine()));

        gestionAlmacen.baja(articulo);
        System.out.println("Artículo borrado correctamente");    }

    private static void modificaArticulo(GestionAlmacen almacen, Scanner sc) throws Exception {
        // Artículo
        Articulo articulo = new Articulo();

        System.out.println("Alta de nuevo artículo en el almacén:");
        System.out.println();

        System.out.print("Código: ");
        articulo.setCodigo(Integer.parseInt(sc.nextLine()));

        System.out.print("Descripción: ");
        articulo.setDescripcion(sc.nextLine());

        System.out.print("Precio de compra: ");
        articulo.setPrecioCompra(Double.parseDouble(sc.nextLine()));

        System.out.print("Precio de venta: ");
        articulo.setPrecioVenta(Double.parseDouble(sc.nextLine()));

        System.out.print("Stock inicial: ");
        articulo.setStock(Integer.parseInt(sc.nextLine()));

        // Insertar disco en la tienda
        almacen.modificar(articulo);

        System.out.println("Artículo modificado correctamente");
    }

    private static void entradaMercancia(GestionAlmacen almacen, Scanner sc) throws Exception {
        System.out.println("Por favor, introduzca el código del artículo: ");
        int codigo = Integer.parseInt(sc.nextLine());

        Articulo articulo = new Articulo();
        articulo.setCodigo(codigo);
        almacen.entradaMercancia(articulo, sc);

        System.out.println("Entrada de mercancía finalizada correctamente");
    }

    private static void salidaMercancia(GestionAlmacen almacen, Scanner sc) throws Exception {
        System.out.println("Por favor, introduzca el código del artículo: ");
        int codigo = Integer.parseInt(sc.nextLine());

        Articulo articulo = new Articulo();
        articulo.setCodigo(codigo);
        almacen.salidaMercancia(articulo, sc);

        System.out.println("Salida de mercancía finalizada correctamente");
    }

}
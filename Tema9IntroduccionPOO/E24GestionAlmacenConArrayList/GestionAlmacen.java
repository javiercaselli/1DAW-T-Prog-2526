package Tema9IntroduccionPOO.E24GestionAlmacenConArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlmacen {
    // Atributos
    ArrayList<Articulo> almacen = new ArrayList<>();

    public ArrayList<Articulo> listarArticulos() {
        return almacen;
    }

    public void alta(Articulo articulo) throws Exception {
        // Comprobar que el código (ID) no exista ya en la colección
        for (Articulo otroArticulo : almacen) {
            if (otroArticulo.equals(articulo)) {
                throw new Exception("ERROR: El cógdigo ya está registrado en la base de datos");
            }

            //            Forma alternativa de comprobar la igualdad sin tener que implementar equals() en la clase Articulo
            //            if (otroArticulo.getCodigo() == articulo.getCodigo()) {
            //                throw new Exception("ERROR: El cógdigo ya está registrado en la base de datos");
            //            }
        }

        // Añade el artículo al final de la lista.
        almacen.add(articulo);
    }

    public void baja(Articulo articulo) throws Exception {
        almacen.remove(articulo);
    }

    public void modificar(Articulo articulo) throws Exception {
        if  (almacen.contains(articulo)) {
            almacen.set(almacen.indexOf(articulo), articulo);
        } else {
            throw new Exception("ERROR: El cógdigo del artículo no está registrado en la base de datos. No se puede modificar");
        }
    }

    public void entradaMercancia(Articulo articulo, Scanner sc) throws Exception {
        if (almacen.contains(articulo)) {
            System.out.println("Entrada de mercancía del siguiente articulo:");
            articulo = almacen.get(almacen.indexOf(articulo));
            System.out.println(articulo);

            System.out.print("Introduzca el número de unidades que entran: ");
            articulo.setStock(Integer.parseInt(sc.nextLine()) + articulo.getStock());

        } else {
            throw new Exception("ERROR: El cógdigo del artículo no está registrado en la base de datos. No se puede añadir mercancía");
        }
    }

    public void salidaMercancia(Articulo articulo, Scanner sc) throws Exception {
        if (almacen.contains(articulo)) {
            System.out.println("Entrada de mercancía del siguiente articulo:");
            articulo = almacen.get(almacen.indexOf(articulo));
            System.out.println(articulo);

            System.out.print("Introduzca el número de unidades que salen: ");
            int stockSalida = Integer.parseInt(sc.nextLine());
            if (stockSalida > articulo.getStock()) {
                throw new Exception("ERROR: El stock de salida es mayor que el stock existente en almacén, no es posible realizar la operación solicitada");
            } else {
                articulo.setStock(articulo.getStock() - stockSalida);
            }
        } else {
            throw new Exception("ERROR: El cógdigo del artículo no está registrado en la base de datos. No se puede añadir mercancía");
        }
    }
}

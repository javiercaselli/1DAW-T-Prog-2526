package clases;

import java.util.ArrayList;

public class Catalogo<T> implements CatalogoInterface<T> {
    ArrayList<T> coleccion = new ArrayList<>();

    /**
     * @param item
     * @return
     */
    @Override
    public boolean aniadir(T item) {
        if (!coleccion.contains(item)) {
            coleccion.add(item);
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param item
     */
    @Override
    public void eliminar(T item) {
        coleccion.remove(item);
    }

    /**
     * @return
     */
    @Override
    public ArrayList<T> recuperarElementos() {
        return coleccion;
    }
}

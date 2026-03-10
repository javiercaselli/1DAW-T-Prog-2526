package Tema9IntroduccionPOO.E22TiendaDiscos;

public class TiendaDiscos implements ComercioElectronico {
    // Propiedades
    private Disco[] listaDiscos = new Disco[100];

    @Override
    public void añadir(Disco disco) throws Exception {
        // Comprobar que el código no exista ya en la colección
        for (Disco discoActual : listaDiscos) {
            if (discoActual != null && discoActual.getCodigo().equals(disco.getCodigo())) {
                throw new Exception("ERROR: El código ya está registrado en la Base de Datos");
            }
        }

        // Buscar hueco libre en el array.
        int i = 0;
        while ((listaDiscos[i] != null) && (i < listaDiscos.length)) {
            i++;
        }

        // Inserta el disco
        if (i < listaDiscos.length) {
            listaDiscos[i] = disco;
        } else {
            throw new Exception("ERROR: El espacio de almacenamiento está lleno");
        }
    }

    @Override
    public Disco[] listar() {
        return listaDiscos;
    }

    @Override
    public void editar(Disco disco) throws Exception {
        // Buscar disco en el catálogo
        int i = 0;
        boolean encontrado = false;
        while (i < listaDiscos.length && !encontrado) {
            encontrado = listaDiscos[i] != null && listaDiscos[i].getCodigo().equals(disco.getCodigo());
            i++;
        }

        if (encontrado) {
            listaDiscos[i-1] = disco;
        } else {
            throw new Exception("ERROR: El disco introducido no existe, no se puede editar");
        }

    }

    @Override
    public void borrar(Disco disco) throws Exception {
        // Buscar disco en el catálogo
        int i = 0;
        boolean encontrado = false;
        while (i < listaDiscos.length && !encontrado) {
            encontrado = listaDiscos[i] != null && listaDiscos[i].getCodigo().equals(disco.getCodigo());
            i++;
        }

        if (encontrado) {
            listaDiscos[i-1] = null;
        } else {
            throw new Exception("ERROR: El disco introducido no existe, no se puede eliminar");
        }

    }
}

package clases;

import excepciones.DuplicateTournamentException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class GestorTorneos implements TorneoInterface {

    // Propiedades
    Catalogo<Torneo> catalogo;

    // Constructor
    public GestorTorneos() {
        catalogo = new Catalogo<>();
    }

    @Override
    public void nuevoTorneo(Torneo torneo) throws DuplicateTournamentException {
        if (!catalogo.aniadir(torneo)) {
            throw new DuplicateTournamentException("El torneo ya existe");
        }
    }

    @Override
    public void eliminarTorneo(Torneo torneo) {
        catalogo.eliminar(torneo);
    }

    @Override
    public ArrayList<Torneo> buscarPorNombre(String nombre) {
        // Valor de retorno
        ArrayList<Torneo> torneos = new ArrayList<>();

        for(Torneo t : catalogo.recuperarElementos()) {
            if(t.getNombre().equalsIgnoreCase(nombre)) {
                torneos.add(t);
            }
        }

        return torneos;
    }

    @Override
    public ArrayList<Torneo> listarOrdenadoPorFecha() {
        // Forma 1
        ArrayList<Torneo> torneosOrdenados = new ArrayList<>(catalogo.recuperarElementos());

        //        // Forma 2
        //        ArrayList<Torneo> torneosOrdenados  = new ArrayList<>();
        //        torneosOrdenados.addAll(catalogo.recuperarElementos());

        Collections.sort(torneosOrdenados);
        return torneosOrdenados;
    }

    @Override
    public ArrayList<Torneo> listarPremiados() {
        // Valor de retorno
        ArrayList<Torneo> torneosConPremio = new ArrayList<>();
        for(Torneo t : catalogo.recuperarElementos()) {
            if(t.getPremio() != null && t.getPremio() > 0.0) {
                torneosConPremio.add(t);
            }
        }

        return torneosConPremio;
    }

    @Override
    public void guardar(String nombreArchivo) throws IOException {
        final String SEPARATOR = ";";
        FileWriter fw = new FileWriter(nombreArchivo);
        BufferedWriter bw = new BufferedWriter(fw);

        /*
        * TODO Escribir una línea en el fichero por cada torneo en el catálogo
        *  dicha linea debe contener todas las propiedades del torneo separadas
        *  por la constante SEPARATOR proporcionada. Usar "\n" al final de cada
        *  línea para el retorno de carro.
        *  Ejemplo de escritura de UNA línea: bw.write("Hola" + SEPARATOR + "Mundo\n"
        * */

        // Cierra descriptores
        bw.close();
        fw.close();
    }
}

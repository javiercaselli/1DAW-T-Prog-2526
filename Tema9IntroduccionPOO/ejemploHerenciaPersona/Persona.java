package Tema9IntroduccionPOO.ejemploHerenciaPersona;

public class Persona {
    private String nombre;
    private String apellido = "";

    Persona() {

    }

    Persona(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}

package Tema9IntroduccionPOO.ejemploHerenciaPersona;

public class Alumno extends Persona {
    private int curso;
    Alumno() {
        super();
    }

    Alumno(String nombre) {
        super(nombre);
    }

    Alumno(String nombre, int curso) {
        super(nombre);
        this.curso = curso;
    }
}

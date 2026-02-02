package Tema9IntroduccionPOO.ejemploHerenciaPersona;

public class EjemploPersonaMain {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Javi");

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno("Pepe");
        Alumno alumno3 = new Alumno("Pepe", 1);

        System.out.println("Adios");

    }
}

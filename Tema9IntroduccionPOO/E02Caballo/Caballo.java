package Tema9IntroduccionPOO.E02Caballo;

import java.util.Random;

public class Caballo extends Animal {
    // constructor
    public Caballo() {
        super();
    }

    public Caballo(String nombre, int edad) {
        super(nombre, edad);
    }

    public Caballo(String nombre, String raza, String dieta, int edad, String genero, double peso) {
        super(nombre, raza, dieta, edad, genero, peso);
    }

    // metodos
    public String cabalgar() {
        if ("algarrobas".equals(super.getDieta())) {
            return "Cabalga cabalga FELIZ";
        } else {
            return "Cabalga cabalga triste porque le dan comida basura";
        }
    }

    public String comer() {
        return "Ñam, ñam, ñam";
    }

}

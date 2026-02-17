package Tema9IntroduccionPOO.E02Caballo;

import java.util.Random;

public class Animal {
    // atributos
    private String nombre;
    private String raza;
    private String dieta;
    private int edad;
    private String genero;
    private double peso;

    // constructores
    public Animal(String nombre, String raza, String dieta, int edad, String genero, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.dieta = dieta;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
    }

    public Animal() {
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    private boolean estaVivo() {
        Random rand = new Random();
        return rand.nextBoolean();
    }

    public String decirNombre() {
        if (estaVivo()) return "Hola, soy " + nombre;
        else return "Está muerto";
    }

    public String relinchar() {
        return "Hiaaaaaaa";
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 10) {
            System.out.println("ERROR: El nombre es demasiado largo");
        } else {
            this.nombre = nombre;
        }
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 30) this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}

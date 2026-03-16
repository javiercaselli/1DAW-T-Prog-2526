package Tema10ColeccionesYDiccionarios.ejemplosApuntes;

import java.util.Comparator;

public class GatoCompareTo implements Comparable<GatoCompareTo> {
    // atributos
    private String nombre, raza, sexo ;
    private Integer    edad ;
    private Double peso ;

    // constructor
    public GatoCompareTo(String nombre, String raza, String sexo, int edad, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int compareTo(GatoCompareTo otroGato) {
        if (this.sexo.compareTo(otroGato.sexo) == 0) return this.nombre.compareTo(otroGato.nombre);
        else return this.sexo.compareTo(otroGato.sexo);
    }

    @Override
    public String toString() {
        return "GatoCompareTo{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }
}

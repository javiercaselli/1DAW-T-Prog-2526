package Tema9IntroduccionPOO.E02Caballo;

public class Gato extends Animal {

    // contructor
    public Gato() {
        super();

    }

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public Gato(String nombre, String raza, String dieta, int edad, String genero, double peso) {
        super(nombre, raza, dieta, edad, genero, peso);
    }

    // métodos
    public String maullar() {
        return "Miau miau";
    }

    public String ronronear() {
        return "Grrrrrrrrrr";
    }


}

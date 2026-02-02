package Tema9IntroduccionPOO.ejemploGato;

public class Gato {
    // Propiedades
    public String nombre;
    public String color;
    public String raza;
    public String sexo;
    public int edad;
    public double peso;

    // Constructores
    public Gato(String nombre, String color, String raza, String sexo, int edad, double peso) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Gato() {

    }

    // Métodos
    public void maullar() {
        System.out.println(this.nombre + " dice 'Miau miau'");
    }

    public void ronronear() {
        System.out.println(this.nombre + " dice 'Brrrrrrrrrrrrrrrrr'");
    }

    public void comer(String comida) {
        System.out.println(this.nombre + " va a comer " + comida);
    }

    public void pelearseCon(Gato otroGato) {
        System.out.println("Voy a pelearme con " + otroGato.nombre);
    }
}
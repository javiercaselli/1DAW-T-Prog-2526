package Tema9IntroduccionPOO.ejemploGato;

public class MainGato {
    public static void main(String[] args) {
        Gato garfield = new Gato("Garfield", "Naranja", "Callejero", "M", 8, 10);

        Gato duquesa = new Gato();
        duquesa.nombre = "Duquesa";
        duquesa.color = "Blanca";
        duquesa.edad = 6;
        duquesa.peso = 7;
        duquesa.raza = "Persa";
        duquesa.sexo = "H";

        garfield.maullar();

        duquesa.maullar();
        duquesa.ronronear();

        garfield.pelearseCon(duquesa);

        duquesa.pelearseCon(garfield);

        duquesa.comer("Latita de Whiskas");

        garfield.comer("Lasaña");
    }
}

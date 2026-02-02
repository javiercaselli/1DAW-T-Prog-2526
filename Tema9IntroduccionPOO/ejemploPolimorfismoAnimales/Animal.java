package Tema9IntroduccionPOO.ejemploPolimorfismoAnimales;

public class Animal {
    double peso;
    private String sexo;
    private double longitud;
    private String habitat;

    public void dormir() {
        System.out.println("Zzzzzzz....");
    }

    public void comer(String comida) {
        System.out.println("Estoy comiendo " + comida);
    }

    public void desplazar(int metros) {
        System.out.println("Me desplazo por el suelo " + metros + " metros");
    }
}

package Tema8Funciones;

public class Ejemplo {
    
    public static int sumauno(int numero) {
        int uno = 1;
        numero = numero + uno;

        return numero;

    }
    
    public static void main(String[] args) {
        int numero = 5;
        int resultado = sumauno(numero);
        boolean condicion = false;
        if (condicion) {
            return;
        } else { 
            System.out.println("Hola Mundo");
        }
        System.out.println("Hasta luego");
    }

    
}

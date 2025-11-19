package Tema8Funciones;

import java.util.Scanner;

/**
 * 
 */
public class T08E09DigitoaCadenaTexto {
    
    /**
     * Función que convierte un dígito (entero de una sola cifra) en una cadena de texto.
     * @param i Entrada número entero de una sola cifra.
     * @return cadena de texto equivalente a i
     */
    public static String convierteEnPalabra(int i) {
        // Valor de retorno
        String cadenaTexto = "";

        // Convertirmos el dígito en texto
        switch (i) {
            case 0:
                cadenaTexto = "cero";
                break;
            case 1:
                cadenaTexto = "unos";
                break;
            case 2:
                cadenaTexto = "dos";
                break;
            case 3:
                cadenaTexto = "tres";
                break;
            case 4:
                cadenaTexto = "cuatro";
                break;
            case 5:
                cadenaTexto = "cinco";
                break;
            case 6:
                cadenaTexto = "seis";
                break;
            case 7:
                cadenaTexto = "siete";
                break;
            case 8:
                cadenaTexto = "ocho";
                break;
            case 9:
                cadenaTexto = "nueve";
                break;
        
            default:
                System.out.println("Número inválido");
                break;
        }

        return cadenaTexto;
    }


    /**
     * Función que convierte un número entero en una cadena de texto.
     * 
     * @param i Entrada número entero
     * @return Salida cadena de texto equivalente a i
     */   
    public static String convierteEnPalabras(int i) {  
        // Valor de retorno
        String cadenaTexto = "";

        while (i != 0) {
            // Calculamos el resto
            int resto = i % 10;

            // El resto es lo que tengo que ir convirtiendo en palabra
            cadenaTexto = convierteEnPalabra(resto) + ", " + cadenaTexto;

            i = i / 10;
        }

        return cadenaTexto.substring(0, cadenaTexto.length() - 2);
    }
    
    
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Lee número de pantalla
        System.out.print("Introduzca un número entero: ");
        int numero = sc.nextInt();

        // LLama a la función para convertir el dígito en texto
        String cadenaTexto = convierteEnPalabras(numero);

        // Muestra el resultado por pantalla
        System.err.println(cadenaTexto);

        // Cerrar Scanner
        sc.close();
    }
}

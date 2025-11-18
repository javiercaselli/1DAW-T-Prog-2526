package Tema8Funciones;

/**
 * Libreria de conversiones numéricas.
 */
public class T08E06Conversiones {
    /**
     * Función que convierte de binario a decimal.
     * 
     * @param entrada Entrada binaria
     * @return Salida decimal
     */
    public static int binarioADecimal(String entrada) {
        int salida = Integer.parseInt(entrada, 2);
        return salida;
    }

    /**
     * Función que convierte de octal a decimal.
     * @param entrada Entrada octal
     * @return Salida decimal
     */
    public static int octalADecimal(String entrada) {
        return Integer.parseInt(entrada, 8);
    }

    /**
     * Función que convierte de hexadecimal a decimal.
     * @param entrada Entrada hex
     * @return Salida decimal
     */
    public static int hexADecimal(String entrada) {
        return Integer.parseInt(entrada, 16);
    }


}

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
    public static String binarioADecimal(String entrada) {
        int salida = Integer.parseInt(entrada, 2);
        return Integer.toString(salida);
    }

    /**
     * Función que convierte de binario a octal.
     * 
     * @param entrada Entrada binaria
     * @return Salida octal
     */
    public static String binarioAOctal(String entrada) {
        int decimal = Integer.parseInt(entrada, 2);
        return Integer.toOctalString(decimal);
    }

    /**
     * Función que convierte de binario a hexadecimal.
     * 
     * @param entrada Entrada binaria
     * @return Salida hex
     */
    public static String binarioAHex(String entrada) {
        int decimal = Integer.parseInt(entrada, 2);
        return Integer.toHexString(decimal);
    }

    /**
     * Función que convierte de octal a binario.
     * @param entrada Entrada octal
     * @return Salida binaria
     */
    public static String octalABinario(String entrada) {
        int decimal = Integer.parseInt(entrada, 8);
        return Integer.toBinaryString(decimal);
    }

    /**
     * Función que convierte de octal a decimal.
     * @param entrada Entrada octal
     * @return Salida decimal
     */
    public static String octalADecimal(String entrada) {
        return Integer.toString(Integer.parseInt(entrada, 8));
    }

    /**
     * Función que convierte de octal a hexadecimal.
     * @param entrada Entrada octal
     * @return Salida hex
     */
    public static String octalAHex(String entrada) {
        int decimal = Integer.parseInt(entrada, 8);
        return Integer.toHexString(decimal);
    }

    /**
     * Función que convierte de decimal a binario.
     * @param entrada Entrada Decimal
     * @return Salida binaria
     */
    public static String decimalABinario(String entrada) {
        return Integer.toBinaryString(Integer.parseInt(entrada));
    }

    /**
     * Función que convierte de decimal a octal.
     * @param entrada Entrada octal
     * @return Salida binaria
     */
    public static String decimalAOctal(String entrada) {
        return Integer.toOctalString(Integer.parseInt(entrada));
    }

    /**
     * Función que convierte de decimal a hexadecimal.
     * @param entrada Entrada hex
     * @return Salida binaria
     */
    public static String decimalAHex(String entrada) {
        return Integer.toHexString(Integer.parseInt(entrada));
    }

    /**
     * Función que convierte de hexadecimal a binario.
     * @param entrada Entrada hex
     * @return Salida binaria
     */
    public static String hexABinario(String entrada) {
        int decimal = Integer.parseInt(entrada, 16);
        return Integer.toBinaryString(decimal);
    }

    /**
     * Función que convierte de hexadecimal a octal.
     * @param entrada Entrada hex
     * @return Salida octal
     */
    public static String hexAOctal(String entrada) {
        int decimal = Integer.parseInt(entrada, 16);
        return Integer.toOctalString(decimal);
    }

    /**
     * Función que convierte de hexadecimal a decimal.
     * @param entrada Entrada hex
     * @return Salida decimal
     */
    public static String hexADecimal(String entrada) {
        int decimal = Integer.parseInt(entrada, 16);
        return Integer.toString(decimal);
    }


}

public class Colores {
    public static void main(String[] args) {
        // Colores
        System.out.print("\033[33m mandarina");
        System.out.print("\033[32m hierba");
        System.out.print("\033[31m tomate");
        System.out.print("\033[37m sábanas");
        System.out.print("\033[36m cielo");
        System.out.print("\033[45m nazareno \033[38;5;216m patata");
        System.out.println("\033[34m mar \033[0m");

        // Negrita, cursiva y subrayado
        System.out.println();
        System.out.println("\033[1m Negrita\033[0m");
        System.out.println("\033[3m Cursiva\033[0m");
        System.out.println("\033[4m Subrayado\033[0m");

        // Caracteres unicode (caracteres especiales, otros alfabetos, emojis, etc.)
        System.out.println();
        System.out.println("¡Hola mundo! \u263A");

        // Salida formateada (comando printf)
        System.out.println();
        System.out.printf("El número %d no tiene decimales.\n", 21);
        System.out.printf("El número %f sale con decimales.\n", 21.0);
        System.out.printf("El %.3f sale exactamente con %d decimales.\n", 21.0, 3);
        System.out.printf("El %.0f sale exactamente con %d decimales.\n", 21.0, 0);

        // Desplazamiento y justificación
        System.out.println();
        System.out.printf("%8d\n", 100); // rellena con espacios a la izquierda
        System.out.printf("%08d\n", 100); // rellena con ceros a la izquierda
        System.out.printf("%+d\n", 100); // muestra el signo del número
        System.out.printf("%-8d\n", 100); // rellena con espacios a la derecha

        // Caracteres de escape
        System.out.println();
        System.out.printf("Al final de esta línea se producirá un salto a la siguiente.\n");
        System.out.printf("\tComenzamos con una tabulación.\n");
        System.out.printf("Ahora escribimos comillas dobles: \"\".\n");
        System.out.printf("También la barra inclinada a la izquierda: \\.\n");
        System.out.print("Y las comillas simples: ");
        System.out.println('\'');
    }
}

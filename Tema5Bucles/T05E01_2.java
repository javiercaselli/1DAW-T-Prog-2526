public class T05E01_2 {
    public static void main(String[] args) {
        // Número del que quiero encontrar los múltiplos
        int numero = 17;

        // Variable auxiliar para calcular los múltiplos
        int multiplo = 0;

        // Calculo los múltiplos
        for (int i = 0;  multiplo < 100; i++) {
            multiplo = numero * i;
            System.out.print(multiplo + " ");
        }
    }
}

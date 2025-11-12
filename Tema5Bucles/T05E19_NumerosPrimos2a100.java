public class T05E19_NumerosPrimos2a100 {
    public static void main(String[] args) {
        for (int numeros = 2; numeros <= 100; numeros++) {
            //comprueba si es primo
            boolean esPrimo = true;
            for(int divisor = 2; esPrimo && (divisor < (numeros / 2 + 1)); divisor++) {
                esPrimo = !(numeros % divisor == 0);
            }

            if (esPrimo) System.out.print(numeros + " ");
        }
    }
}

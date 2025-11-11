import java.util.Scanner;

class T05E17_PiramideHueca {
    public static void main(String[] args) {
        // Variables
        int altura = 0;
        String caracter;

        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide (mínimo 5): ");
        altura = sc.nextInt();
        if (sc.hasNextLine()) sc.nextLine();

        System.out.print("Introduce el caracter de relleno: ");
        caracter = sc.nextLine();

        // Preguntamos por el caracter de relleno hasta que tenga longitud 1
        while (caracter.length() != 1) {
            System.out.println("Error: solo se puede introducir un caracter");
            System.out.print("Introduce de nuevo el caracter de relleno: ");
            caracter = sc.nextLine();
        }

        // Dibuja la pirámide
        String fila = caracter;
        int alturaOriginal = altura;
        while (altura > 0) {
            // Calcula los huecos
            String huecos = "";
            for (int i = 1; i <= altura - 1; i++) {
                huecos = " " + huecos;
            }
            // Imprime los huecos
            System.out.print(huecos);

            // Imprime la fila
            System.out.println(fila);
            huecos = " ";


            // Huecos internos
            if (altura != 2) huecos = " ";
            else huecos = caracter;

            for (int j = altura; j < alturaOriginal; j++) {
                if (altura > 2) {
                    huecos = "  " + huecos;
                } else {
                    huecos = caracter + caracter + huecos;
                }
            }
            fila = caracter + huecos + caracter;
            altura--;
        }


        sc.close();
    }
}
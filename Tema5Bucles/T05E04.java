import java.util.Scanner;

public class T05E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean acierto = false;
        int intentos = 4;
        int combinacion = 1234;

        while (!acierto && intentos > 0) {
            System.out.print("Introduce la clave de la caja fuerte: ");
            int intento = sc.nextInt();
            
            // Comprueba si se ha acertado la combinación
            if (intento == combinacion) {
                acierto = true;
            } else {
                System.out.println("Clave errónea");
            }

            // Otra forma de hacer la comprobación mediante las propiedades de los tipos booleanos
            /*
            acierto = (intento == combinacion);

            if (!acierto) {
                System.out.println("Clave errónea");
            }
            */

            // Decrementamos los intentos disponibles
            intentos--;
        }

        if (acierto) {
            System.out.println("Se ha abierto la caja fuerte");
        } else {
            System.out.println("Ha agotado los intentos, se ha avisado a la policía");
        }

        sc.close();
    }
}

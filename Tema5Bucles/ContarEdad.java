import java.util.Scanner;

public class ContarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca edad: ");
        int edad = sc.nextInt();

        for (int i = 1; i <= edad; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}

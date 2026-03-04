package Tema9IntroduccionPOO.E12RedondeoDecimales;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainE12EjemploRedondeoDecimales {
    public static void main(String[] args) {
        // Ejemplo de uso de BigDecimal y redondeo de decimales

        // Manejo de decimales grandes en java con redondeo. En el ejemplo, redondeo a dos decimales
        double valor = 123.454789;
        BigDecimal bd = new BigDecimal(Double.toString(valor));
        bd = bd.setScale(2, RoundingMode.HALF_UP);  // Investigar la clase RoundingMode para más modos de redondeo
        System.out.println("Valor redondeado: " + bd);
    }
}

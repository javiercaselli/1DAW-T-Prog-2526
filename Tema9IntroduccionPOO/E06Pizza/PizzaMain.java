package Tema9IntroduccionPOO.E06Pizza;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        p2.servir();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.servir();
        System.out.println("pedidas: " + Pizza.getPizzasPedidas());
        System.out.println("servidas: " + Pizza.getPizzasServidas());
    }
}

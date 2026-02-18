package Tema9IntroduccionPOO.E06Pizza;

public class Pizza {
    // atributos de clase
    private static int pizzasPedidas = 0;
    private static int pizzasServidas = 0;

    // atributos de instancia
    private String tamanio;
    private String tipo;
    private String estado;

    // constructor
    public Pizza(String tamanio, String tipo) {
        this.tamanio = tamanio;
        this.tipo = tipo;
        this.estado = "pedida";
        pizzasPedidas++;
    }

    // métodos
    public void servir() {
        if ("pedida".equals(estado)) {
            estado = "servida";
            pizzasServidas++;
        } else {
            System.out.println("No se puede servir una pizza ya servida");
        }
    }

    // Getters y Setters estáticos
    public static int getPizzasPedidas() {
        return pizzasPedidas;
    }

    public static void setPizzasPedidas(int pizzasPedidas) {
        Pizza.pizzasPedidas = pizzasPedidas;
    }

    public static int getPizzasServidas() {
        return pizzasServidas;
    }

    public static void setPizzasServidas(int pizzasServidas) {
        Pizza.pizzasServidas = pizzasServidas;
    }

    // toString
    public String toString() {
        return "Pizza: " + tamanio + " " + tipo + ", " + estado;
    }


}

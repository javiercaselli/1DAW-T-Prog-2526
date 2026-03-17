package Tema9IntroduccionPOO.E24GestionAlmacenConArrayList;

public class Articulo {
    // Atributos
    private int codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    // Constructores

    /**
     * Constructor vacío
     */
    public Articulo() {

    }

    /**
     * Contructor completo.
     * @param codigo
     * @param descripcion
     * @param precioCompra
     * @param precioVenta
     * @param stock
     */
    public Articulo(int codigo,  String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Código: " + this.codigo + " [Descripción: " + this.descripcion + " - Precio compra: " + this.precioCompra +
                " - Precio venta: " + this.precioVenta + " - Stock: " + this.stock + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Articulo articulo) {
            return (this.codigo == articulo.codigo);
        } else {
            return false;
        }
    }
}

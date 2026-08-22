package src;

public class Producto {

    String nombreProducto;
    int cantidad;
    double precioVenta;
    double precioCompra;

    public Producto(String nombreProducto, int cantidad, double precioVenta, double precioCompra) {

        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
    }
}
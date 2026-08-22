package src;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("        TIENDITA JAVA");
        System.out.println("================================");

        ArrayList<Producto> inventario = new ArrayList<>();

        Producto coca600 = new Producto("Coca 600", 12, 27.00, 17.08);

        Producto coca355 = new Producto("Coca 355", 19, 17.00, 12.17);

        Producto boingManzana = new Producto("Boing Manzana", 4, 20.00, 14.00);

        Producto boingFresa = new Producto("Boing Fresa", 1 , 20, 14);

        Producto cocaLata355 = new Producto("Coca Lata 355", 4, 28, 21);

        Producto bonafont1L = new Producto("Bonafont 1Lt", 7, 14, 6.92);

        inventario.add(coca600);
        inventario.add(coca355);
        inventario.add(boingManzana);
        inventario.add(boingFresa);
        inventario.add(cocaLata355);
        inventario.add(bonafont1L);

        double valorCompraTotal = 0;

        for (Producto producto : inventario) {

            valorCompraTotal += producto.precioCompra * producto.cantidad;

            System.out.println("Producto: " + producto.nombreProducto);
            System.out.println("Stock: " + producto.cantidad);
            System.out.println("Precio venta: $" + producto.precioVenta);
            System.out.println("Precio compra: $" + producto.precioCompra);
            System.out.println("Valor compra del producto:$"   + producto.precioCompra * producto.cantidad );

            System.out.println("-----------------------------");
        }
            System.out.println("Valor compra TOTAL del inventario: $" + valorCompraTotal);
    }
}
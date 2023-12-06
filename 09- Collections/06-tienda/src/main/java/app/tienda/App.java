package app.tienda;

import app.tienda.servicios.ProductoServicios;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        System.out.println(" /// Tienda /// ");

        ProductoServicios serviceClass = new ProductoServicios();

        serviceClass.cargarProductos();
        serviceClass.mostrarProductos();
        

    }
}

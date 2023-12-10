package app.tienda;

import app.tienda.servicios.ProductoServicios;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        //welcome
        System.out.println(" /// Tienda /// ");

        //instance of services
        ProductoServicios serviceClass = new ProductoServicios();

        //scanner
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        //flag
        boolean salir = false;
        //loop
        do {
            //menu
            System.out.println("    Menu    "
                    + "\n a- Ingresar ítems"
                    + "\n b- Eliminar"
                    + "\n c- Modificar"
                    + "\n d- Mostrar"
            + "\n e- Salir");
            switch (scan.next().toLowerCase()) {
                case "a" ->
                    serviceClass.cargarProductos();
                case "b" ->
                    serviceClass.eliminarProducto();
                case "c" ->
                    serviceClass.modificarPrecio();
                case "d" ->
                    serviceClass.mostrarProductos();
                case "e" ->
                    salir = true;
                default ->
                    salir = false;
            }
        } while (!salir);
    }
}

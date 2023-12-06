package app.tienda.servicios;

import app.tienda.entidades.Producto;
import java.util.Random;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class ProductoServicios {

    private final Scanner scan;
    private final HashMap<Integer, Producto> productos;

    public ProductoServicios() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap();
    }

    public Producto crear() {
        System.out.print("Nombre: ");
        String nombre = scan.next();
        System.out.print("Precio: ");
        Double precio = scan.nextDouble();

        return new Producto(nombre, precio);
    }

    public HashMap<Integer, Producto> cargarProductos() {
        boolean salir = false;
        String rta;
        Random random = new Random(); //creo un objeto random.
        Integer codigo = Math.abs(random.nextInt()); //Math.abs me garantiza que el nro no sea negativo.
        Producto producto = crear();
        
        do {
            productos.put(codigo,producto);

            System.out.print("¿Cargar otro producto? (s/n): ");
            rta = scan.next();

            if (rta.equalsIgnoreCase("n")) {
                salir = true;
            } else if (rta.equalsIgnoreCase("s")) {
                salir = false;
            }

            while (!rta.equalsIgnoreCase("n")
                    && !rta.equalsIgnoreCase("s")) {
                System.out.println("Debes ingresar una respuesta correcta.");
                System.out.print("¿Cargar otro producto? (s/n): ");
                rta = scan.next();

                if (rta.equalsIgnoreCase("n")) {
                    salir = true;
                } else if (rta.equalsIgnoreCase("s")) {
                    salir = false;
                }
            }

        } while (!salir);

        return productos;
    }

    public void mostrarProductos() {
        System.out.println();
        
        //COMPLETAR
        
        System.out.println();
    }

}

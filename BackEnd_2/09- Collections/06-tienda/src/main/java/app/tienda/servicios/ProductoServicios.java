package app.tienda.servicios;

import app.tienda.entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class ProductoServicios {

    private final Scanner scan;
    private final HashMap<String, Producto> productos;

    public ProductoServicios() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap();
    }

    public Producto crear() {
        System.out.print("Ítem: ");
        String nombre = scan.next();
        System.out.print("Precio: ");
        Double precio = scan.nextDouble();

        return new Producto(nombre, precio);
    }

    public HashMap<String, Producto> cargarProductos() {
        System.out.println("Cargar productos");
        boolean salir = false;
        String rta;

        do {

            Producto p = crear();

            productos.put(p.getNombre(), p);

            System.out.print("¿Cargar otro ítem? (s/n): ");
            rta = scan.next().toLowerCase();

            if (rta.equalsIgnoreCase("n")) {
                salir = true;
            } else if (rta.equalsIgnoreCase("s")) {
                salir = false;
            }

            while (!rta.equals("n")
                    && !rta.equals("s")) {
                System.out.println("Debes ingresar una respuesta correcta.");
                System.out.print("¿Cargar otro producto? (s/n): ");
                rta = scan.next().toLowerCase();

                if (rta.equals("n")) {
                    salir = true;
                } else if (rta.equals("s")) {
                    salir = false;
                }
            }

        } while (!salir);

        return productos;
    }

    public void mostrarProductos() {
        System.out.println(); //space
        System.out.println("Lista de productos");

        for (Map.Entry<String, Producto> p : productos.entrySet()) {
            System.out.println(p.getKey() + " $" + p.getValue().getPrecio());
        }

        System.out.println(); //space
    }

    public void eliminarProducto() {
        System.out.println("Eliminar ítem");
        System.out.print("Ingresar nombre: ");
        String eliminar = scan.next();

        for (Map.Entry<String, Producto> p : productos.entrySet()) {
            if (eliminar.equalsIgnoreCase(p.getKey())) {
                productos.remove(p.getKey());
                System.out.println("Se ha eliminado.");
                return; // Terminar la función después de actualizar el precio.
            }
        }

        // Si llegamos aquí, significa que no se encontró el producto.
        System.out.println("Producto no encontrado.");
        System.out.println(); //space
    }

    public void modificarPrecio() {
        System.out.println("Actualizar precio");

        System.out.print("Buscar por nombre del producto: ");
        String modificar = scan.next();

        for (Map.Entry<String, Producto> p : productos.entrySet()) {
            if (modificar.equalsIgnoreCase(p.getKey())) {
                System.out.print("Ingresar nuevo precio para "
                        + p.getKey() + ": ");
                p.getValue().setPrecio(scan.nextDouble());

                System.out.println("Precio actualizado correctamente.");
                return; // Terminar la función después de actualizar el precio.
            }
        }

        // Si llegamos aquí, significa que no se encontró el producto.
        System.out.println("Producto no encontrado.");
        System.out.println(); //space
    }

}

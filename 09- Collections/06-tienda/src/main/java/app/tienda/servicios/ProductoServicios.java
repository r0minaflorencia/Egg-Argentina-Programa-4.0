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
        System.out.print("Nombre: ");
        String nombre = scan.next();
        System.out.print("Precio: ");
        Double precio = scan.nextDouble();

        return new Producto(nombre, precio);
    }

    public HashMap<String, Producto> cargarProductos() {
        boolean salir = false;
        String rta;

        do {

            Producto p = crear();

            productos.put(p.getNombre(), p);

            System.out.print("¿Cargar otro producto? (s/n): ");
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
        System.out.println();
        
        for (Map.Entry<String, Producto> p : productos.entrySet()) {
            System.out.println(p.getKey() + " $" + p.getValue().getPrecio());
        }
        
        System.out.println();
    }
    
    public void eliminarProducto() {
        
    }
    
    public void modificarPrecio() {
        
    }
    
    

}

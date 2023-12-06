/* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. 
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista ordenada.
Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará la lista ordenada. */
package app.buscar_perro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
        System.out.println(" /// Welcome /// ");
        List<String> Perros = new ArrayList();
        crearLista(Perros);
        mostrar(Perros);
        buscar(Perros);
    }

    public static List<String> crearLista(List<String> Perros) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        boolean salir = false;
        do {
            System.out.print("Ingresar perro: ");
            Perros.add(scan.next());
            System.out.print("¿Cargar otro perro? (s/n): ");
            String rta = scan.next();
            if (rta.equalsIgnoreCase("n")) {
                salir = true;
            }
        } while (!salir);

        return Perros;
    }

    public static void mostrar(List<String> Perros) {
        System.out.println(Perros.toString());
    }

    public static void buscar(List<String> Perros) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Buscar perro: ");
        String buscar = scan.next();

        Iterator<String> iterator = Perros.iterator();

        while (iterator.hasNext()) {
            String Perro = iterator.next();
            if (buscar.equalsIgnoreCase(Perro)) {
                System.out.println("Se ha encontrado a " + Perro);
                System.out.print("¿Eliminar a " + Perro + "? (s/n): ");
                String rta = scan.next();
                if (rta.equalsIgnoreCase("s")) {
                    // Utilizar el iterador para eliminar de manera segura
                    iterator.remove();
                    System.out.println(Perro + " ha sido eliminado.");
                }
            }

            System.out.println("Lista actualizada: ");
            System.out.println(Perros.toString());
        }
    }
}

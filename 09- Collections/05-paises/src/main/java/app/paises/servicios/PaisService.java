package app.paises.servicios;

import app.paises.entidades.Pais;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Romina
 */
public class PaisService {

    private final Scanner scan;
    private final TreeSet<Pais> paises;

    public PaisService() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.paises = new TreeSet<>();
    }

    public Pais crear() {

        System.out.println("Ingresar país");
        System.out.print("Nombre: ");
        String nombre = scan.next();

        return new Pais(nombre);
    }

    public TreeSet<Pais> guardar() {
        boolean salir = false;
        String rta;

        do {
            paises.add(crear());

            System.out.print("¿Cargar otro país? (s/n): ");
            rta = scan.next();

            if (rta.equalsIgnoreCase("n")) {
                salir = true;
            } else if (rta.equalsIgnoreCase("s")) {
                salir = false;
            }

            while (!rta.equalsIgnoreCase("n")
                    && !rta.equalsIgnoreCase("s")) {
                System.out.println("Debes ingresar una respuesta correcta.");
                System.out.print("¿Cargar otro país? (s/n): ");
                rta = scan.next();

                if (rta.equalsIgnoreCase("n")) {
                    salir = true;
                } else if (rta.equalsIgnoreCase("s")) {
                    salir = false;
                }
            }

        } while (!salir);

        return paises;
    }

    public void mostrar() {
        System.out.println();

        paises.forEach((e) -> System.out.println(e));

        System.out.println();
    }

    public void eliminar() {
        String rta;

        do {
            System.out.print("¿Eliminar elemento del TreeSet? (s/n): ");
            rta = scan.next().toLowerCase();

            if (rta.equals("s")) {
                System.out.print("Nombre del país: ");
                String eliminar = scan.next();

                Pais paisEliminar = new Pais(eliminar); // Creamos un objeto con el nombre para la comparación
                boolean removido = paises.remove(paisEliminar);

                if (removido) {
                    System.out.println("Elemento eliminado exitosamente.");
                } else {
                    System.out.println("No se encontró el país. Nada fue eliminado.");
                }
            } else if (!rta.equals("n")) {
                System.out.println("Debes ingresar 's' o 'n'.");
            }

        } while (!rta.equals("n"));
    }

}

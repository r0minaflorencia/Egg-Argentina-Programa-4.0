package app.artista;

import app.artista.entidades.Artista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.*/
/**
 *
 * @author Romina
 */
public class Extra02Artista {

    public static void main(String[] args) {

        System.out.println(" /// Welcome /// ");

        //objetos ya cargados de ejemplo
        Artista masego = new Artista("Masego", "My city");
        Artista dua = new Artista("Dua Lipa", "Future nostalgia");
        Artista miranda = new Artista("Miranda!", "Safari");
        Artista avril = new Artista("Avril Lavigne", "Under my skin");
        Artista cardellino = new Artista("Cardellino", "Love Dealer");

        //array
        List<Artista> list = new ArrayList();
        list.add(masego);
        list.add(dua);
        list.add(miranda);
        list.add(avril);
        list.add(cardellino);

        //menu
        menu(list);

    }

    public static void menu(List<Artista> list) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println(); //space

        boolean salir = false; //flag

        do {
            System.out.println("Selecciona una opción:"
                    + "\na- mostrar lista"
                    + "\nb- actualizar lista"
                    + "\nc- eliminar elemento"
                    + "\nd- salir");
            String rta = scan.next().toLowerCase();
            switch (rta) {
                case "a":
                    mostrar(list);
                    break;
                case "b":
                    agregar(list);
                    break;
                case "c":
                    eliminar(list);
                    break;
                case "d":
                    System.out.println("Log out.");
                    salir = true;
                    break;
                default:
                    System.out.println("Debes ingresar una respuesta válida.");
            }
        } while (!salir);
        System.out.println(); //space

    }

    public static void mostrar(List<Artista> list) {
        System.out.println(); //space
        for (Artista artist : list) {
            System.out.println("[" + artist + "]");
        }
        System.out.println(); //space
    }

    public static void agregar(List<Artista> list) {
        boolean salir = false; //flag
        Scanner scan = new Scanner(System.in).useDelimiter("\n"); //scanner

        do {
            System.out.print("¿Agregar otro artista? (s/n): ");
            String rta = scan.next().toLowerCase();
            switch (rta) {
                case "s":
                    System.out.print("Nombre: ");
                    String nombre = scan.next();
                    System.out.print("Disco más vendido: ");
                    String discoMasVendido = scan.next();
                    list.add(new Artista(nombre, discoMasVendido));
                    break;
                case "n":
                    salir = true;
                    break;
                default:
                    System.out.println("Debes ingresar una respuesta válida.");
                    break;
            }
        } while (!salir);
    }

    public static void eliminar(List<Artista> list) {
        boolean salir = false; //flag
        Scanner scan = new Scanner(System.in).useDelimiter("\n"); //scanner

        do {
            System.out.print("¿Eliminar elemento? (s/n): ");
            String rta = scan.next().toLowerCase();

            switch (rta) {
                case "s":
                    System.out.print("Buscar por nombre del artista: ");
                    String nombre = scan.next().toLowerCase();
                    boolean encontrado = false;

                    for (Artista artista : list) {
                        if (artista.getNombre().equalsIgnoreCase(nombre)) {
                            encontrado = true;
                            if (encontrado) {
                                System.out.print("¿Seguro que deseas eliminar a " + artista.getNombre() + "? "
                                        + "(s/n): ");
                                String confirm = scan.next().toLowerCase();
                                if (confirm.equals("s")) {
                                    if (list.remove(artista)) {
                                        System.out.println("Se ha eliminado correctamente.");
                                    }
                                } else {
                                    System.out.println("Error, no se ha podido eliminar correctamente.");
                                }
                            }
                            return;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se ha encontrado resultados de búsqueda.");
                    }

                case "n":
                    salir = true;
                    break;
                default:
                    System.out.println("Debes ingresar una respuesta válida.");
                    break;
            }
        } while (!salir);
    }
}

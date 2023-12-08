/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. 
Si decide salir, se mostrará todos los perros guardados en el ArrayList.*/
package app.perros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
        System.out.println(" /// Welcome /// ");
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        List<String>Perros = new ArrayList();
        
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

        System.out.println(Perros.toString());
    }
}

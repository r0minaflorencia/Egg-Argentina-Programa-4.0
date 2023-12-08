/*1. Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.*/
package libreria;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
        
        //welcome
        System.out.println("Librería");

        //scanner
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        //solicitar datos al usuario
        System.out.println("Cargar datos del libro");
        System.out.print("ISBN: ");
        Integer isbn = scan.nextInt();
        System.out.print("Título: ");
        String titulo = scan.next();
        System.out.print("Autor: ");
        String autor = scan.next();
        System.out.print("Cantidad de páginas: ");
        int nroPaginas = scan.nextInt();

        //instanciar
        Libro libro1 = new Libro(isbn, titulo, titulo, nroPaginas);
        
        //mostrar
        System.out.println(libro1.toString());

        
        
    }
}

package app.persona.servicios;

import app.persona.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class PersonaServicio {

    private Scanner scan;

    public Persona crear() {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Nombre: ");
        String nombre = scan.next();
        System.out.print("Apellido: ");
        String apellido = scan.next();
        System.out.print("Edad: ");
        int edad = scan.nextInt();
        System.out.println("Sexo: "
                + "\n m- mujer"
                + "\n h- hombre"
                + "\n o- otro");
        String opcion = scan.next();
        char sexo = 0;

        if (opcion.equalsIgnoreCase("m")) {
            sexo = 'm';
        } else if (opcion.equalsIgnoreCase("h")) {
            sexo = 'h';
        } else if (opcion.equalsIgnoreCase("o")) {
            sexo = 'o';
        } else {
            System.out.println("Debes indicar una opción válida");
        }

        System.out.print("Altura: ");
        double altura = scan.nextDouble();
        System.out.print("Peso: ");
        int peso = scan.nextInt();

        return new Persona(nombre, apellido, sexo, edad, peso, altura);
    }

    public boolean verificarEdad(Persona persona) {
        
        if (persona.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }

    }

}

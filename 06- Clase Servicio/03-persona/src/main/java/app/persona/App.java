package app.persona;

import app.persona.entidades.Persona;
import app.persona.servicios.PersonaServicio;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Welcome");
        System.out.println();

        PersonaServicio serviceClass = new PersonaServicio();

        //crear persona
        Persona persona = serviceClass.crear();

        //mostrar valores
        System.out.println(persona.toString());

        //verificar mayoría de edad
        System.out.println("¿Es mayor de edad? " + serviceClass.verificarEdad(persona));

    }
}

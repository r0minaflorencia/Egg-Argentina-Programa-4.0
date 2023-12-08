/*
a) Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método validarMayoriaDeEdad que recibe como parámetro una Persona y una edad.
Retorna true si la persona es mayor de edad o false en caso contrario.
d) Método mostrarPersona que muestra la información de la persona deseada. */
package app.datos_persona.servicios;

import app.datos_persona.entidades.Persona;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class PersonaService {

    private Scanner scan;
    private int edad;

    public Persona crear() {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresar datos");
        System.out.print("Nombre: ");
        String nombre = scan.next();
        System.out.println("Fecha de nacimiento");
        System.out.print("Día: ");
        String dia = scan.next();
        System.out.print("Mes: ");
        String mes = scan.next();
        System.out.print("Año: ");
        String anio = scan.next();

        //definir un formato para la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        //concateno las respuestas y las guardo en una única String
        String fechaDeNacimientoString = (anio.concat(mes).concat(dia));

        //Parseo (convierto) la cadena a un objeto LocalDate:
        LocalDate fechaDeNacimiento = LocalDate.parse(fechaDeNacimientoString, formatter);

        return new Persona(nombre, fechaDeNacimiento);
    }

    public int calcularEdad(Persona persona) {
        //obtener fecha actual
        LocalDate fechaActual = LocalDate.now();

        edad = (int) (fechaActual.compareTo(persona.getFechaDeNacimiento()));
        System.out.println("Edad: " + edad + " años.");
        return edad;
    }

    public boolean validarMayoriaDeEdad(Persona persona, int edad) {
        if (edad > 18) {
            System.out.print(persona.getNombre() + " es mayor de edad. ");
            return true;
        } else {
            System.out.println(persona.getNombre() + " es menor de edad.");
            return false;
        }
    }
    
    public void mostrarPersona(Persona persona) {
        System.out.println("Datos");
        System.out.println(persona.toString());
    }
    

}

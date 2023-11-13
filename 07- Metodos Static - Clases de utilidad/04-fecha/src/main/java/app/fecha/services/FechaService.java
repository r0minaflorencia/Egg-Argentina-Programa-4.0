/* 
a) Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
El método debe retornar el objeto LocalDate.
b) Método fechaActual que cree un objeto fecha con el día actual. 
El método debe retornar el objeto LocalDate.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario). */
package app.fecha.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class FechaService {

    private Scanner scan;

    public LocalDate fechaNacimiento() {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa tu fecha de nacimiento");
        System.out.print("Día: ");
        String dd = scan.next();
        System.out.print("Mes: ");
        String mm = scan.next();
        System.out.print("Año: ");
        String yyyy = scan.next();

        //definir un formato para la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        //concateno las respuestas y las guardo en una única String
        String fechaDeNacimientoString = (yyyy.concat(mm).concat(dd));

        //Parseo (convierto) la cadena a un objeto LocalDate:
        LocalDate fechaDeNacimiento = LocalDate.parse(fechaDeNacimientoString, formatter);

        System.out.println("La fecha ingresada es: " + fechaDeNacimiento);
        return fechaDeNacimiento;
    }

    public LocalDate fechaActual() {

        LocalDate hoy = LocalDate.now();

        System.out.println("Hoy es: " + hoy.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        return hoy;
    }

    public int diferencia(LocalDate fechaNacimiento, LocalDate fechaActual) {
        int edad = (int) (fechaActual.compareTo(fechaNacimiento));
        System.out.println("Edad: " + edad + " años.");
        return edad;
    }
}

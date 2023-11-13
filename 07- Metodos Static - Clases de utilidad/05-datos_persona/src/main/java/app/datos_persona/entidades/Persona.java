/* Una persona tiene un nombre y una fecha de nacimiento (Tipo LocalDate), constructor vacío,
constructor parametrizado, get y set.*/
package app.datos_persona.entidades;

import java.time.LocalDate;

/**
 *
 * @author Romina
 */
public class Persona {
    
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "{ Nombre: " + nombre + ", fecha de nacimiento: " + fechaDeNacimiento + '}';
    }

}

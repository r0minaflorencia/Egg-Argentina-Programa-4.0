package app.escuela.servicios;

import app.escuela.entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class AlumnoService {

    Scanner scan;

    public static Alumno cargarDatos() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar datos del alumno/a: ");
        System.out.print("Nombre: ");
        String nombre = scan.next();

        List<Integer> notas = new ArrayList();
        double sumaNotas = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            int nota = scan.nextInt();
            notas.add(nota);
            sumaNotas = sumaNotas + nota;
        }

        return new Alumno(nombre, notas, sumaNotas);
    }

    public List<Alumno> cargarAlumnos(Alumno alumno) {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;

        List<Alumno> alumnos = new ArrayList();

        do {
            alumnos.add(cargarDatos());
            System.out.print("¿Cargar otro/a alumno/a? (s/n): ");
            String rta = scan.next();
            if (rta.equalsIgnoreCase("n")) {
                salir = true;
            }
        } while (!salir);

        System.out.println("Mostrar lista: ");
        System.out.println(alumnos.toString());

        return alumnos;
    }

    public static Alumno buscar(List<Alumno> alumnos) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Buscar alumno/a: ");
        String nombre = scan.next();

        Alumno buscado = null;

        for (Alumno alumno : alumnos) {
            if (nombre.equalsIgnoreCase(alumno.getNombre())) {
                buscado = alumno;
            }
        }

        return buscado;
    }

    public void notaFinal(List<Alumno> alumnos) {
        
        Alumno buscado = buscar(alumnos);

        if (buscado == null) {
            System.out.println("No se encuentran resultados de búsqueda.");
        } else {
            double promedioFinal = Math.round((buscado.getSumaNotas() * 100) / 3);
            System.out.println("La nota final de " + buscado.getNombre()
                    + " es: " + promedioFinal);
        }
        
    }

}

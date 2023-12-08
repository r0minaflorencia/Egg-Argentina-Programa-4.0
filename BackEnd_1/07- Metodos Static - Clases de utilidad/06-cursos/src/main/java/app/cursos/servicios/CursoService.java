/*
a) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada alumno.
b) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos.
c) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
 */
package app.cursos.servicios;

import app.cursos.entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class CursoService {

    private Scanner scan;

    public String[] cargarAlumnos() {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        String[] alumnos = new String[5];

        //llenar vector con los datos ingresados por el usuario
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Nombre del " + (i + 1) + "° alumno/a: ");
            alumnos[i] = scan.next();
        }

        return alumnos;
    }

    public Curso crearCurso() {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Crear curso");
        System.out.print("Nombre del curso: ");
        String nombreCurso = scan.next();
        System.out.print("Turno: ");
        String turno = scan.next();
        System.out.print("Cantidad de horas por día: ");
        int cantidadHorasPorDia = scan.nextInt();
        System.out.print("Cantidad de días por semana: ");
        int cantidadDiasPorSemana = scan.nextInt();
        System.out.print("Precio por hora $: ");
        int precioPorHora = scan.nextInt();

        Curso curso = new Curso(nombreCurso, turno, cantidadHorasPorDia, cantidadDiasPorSemana, precioPorHora);

        curso.setAlumnos(cargarAlumnos());
        
        System.out.println(curso.toString());

        return curso;
    }
    
    public void calcularGananciaSemanal(Curso curso){
        double gananciaSemanal = (curso.getPrecioPorHora() * curso.getCantidadHorasPorDia() * 
                curso.getCantidadDiasPorSemana() * curso.getAlumnos().length);

        System.out.println("La ganancia semanal es de: $" + gananciaSemanal);
    }

}

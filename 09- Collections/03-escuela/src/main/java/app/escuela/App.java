package app.escuela;

import app.escuela.entidades.Alumno;
import app.escuela.servicios.AlumnoService;
import java.util.List;

/**
 *
 * @author Romina
 */
public class App {
    
    public static void main(String[] args) {
        
        System.out.println(" /// Welcome /// ");
        AlumnoService serviceClass = new AlumnoService();
        Alumno alumno = new Alumno();
        
        List<Alumno> alumnos = serviceClass.cargarAlumnos(alumno);
        serviceClass.notaFinal(alumnos);
        
    }
}

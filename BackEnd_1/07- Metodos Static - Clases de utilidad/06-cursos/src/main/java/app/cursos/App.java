package app.cursos;

import app.cursos.entidades.Curso;
import app.cursos.servicios.CursoService;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
      
        System.out.println(" /// Welcome /// ");
        CursoService serviceClass = new CursoService();
        
        //crear curso
        Curso curso = serviceClass.crearCurso();
        
        //calcular ganancia semanal
        serviceClass.calcularGananciaSemanal(curso);
                
    }
}

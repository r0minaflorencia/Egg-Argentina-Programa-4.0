/* Los atributos serán:
nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos.
Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), 
donde se alojarán los nombres de cada alumno.*/
package app.cursos.entidades;

import java.util.Arrays;

/**
 *
 * @author Romina
 */
public class Curso {

    private String[] alumnos = new String[5];
    private String nombreCurso, turno;
    private int cantidadHorasPorDia, cantidadDiasPorSemana, precioPorHora;

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, int cantidadHorasPorDia, int cantidadDiasPorSemana, int precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    @Override
    public String toString() {
        return "Curso {" + "alumnos: " + Arrays.toString(alumnos) + ", nombre del curso: " + nombreCurso
                + ", turno: " + turno + ", cantidad de hs por día: " + cantidadHorasPorDia
                + ", cantidad de días a la semana: " + cantidadDiasPorSemana + ", precio por hora: $"
                + precioPorHora + '}';
    }

}

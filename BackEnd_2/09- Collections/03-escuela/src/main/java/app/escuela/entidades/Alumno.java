package app.escuela.entidades;

import java.util.List;

/**
 *
 * @author Romina
 */
public class Alumno {
    
    private String nombre;
    private List<Integer> notas;
    private double sumaNotas;

    public Alumno() {
    }

    public Alumno(String nombre, List<Integer> notas, double sumaNotas) {
        this.nombre = nombre;
        this.notas = notas;
        this.sumaNotas = sumaNotas;
    }

    public double getSumaNotas() {
        return sumaNotas;
    }

    public void setSumaNotas(double sumaNotas) {
        this.sumaNotas = sumaNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return nombre +" {" + "notas: " + notas + '}';
    }
    
    
}

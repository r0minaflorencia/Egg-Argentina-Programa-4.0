package app.paises.entidades;

import java.util.Objects;

/**
 *
 * @author Romina
 */
public class Pais implements Comparable<Pais> {

    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareToIgnoreCase( o.getNombre());
    }

    @Override
    public String toString() {
        return "{" + nombre + '}';
    }
}

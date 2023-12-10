package app.tienda.entidades;

import java.util.Objects;

/**
 *
 * @author Romina
 */
public class Producto implements Comparable<Producto> {

    private String nombre;
    private Double precio;

    public Producto() {
    }

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nombre);
        hash = 19 * hash + Objects.hashCode(this.precio);
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.precio, other.precio);
    }

    @Override
    public int compareTo(Producto o) {

        return this.nombre.compareToIgnoreCase(o.getNombre());
    }

    @Override
    public String toString() {
        return "Producto {" + nombre + ", precio: $" + precio + '}';
    }

}

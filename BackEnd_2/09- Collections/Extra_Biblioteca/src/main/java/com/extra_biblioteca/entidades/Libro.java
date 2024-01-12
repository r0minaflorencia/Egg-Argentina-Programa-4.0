package com.extra_biblioteca.entidades;

import java.util.UUID;

/**
 *
 * @author Romina
 */
public class Libro {
    
    private String titulo, autor;
    private int disponibles, alquilados;
    private Integer isbn;

    public Libro() {
    }

    public Libro(String titulo, String autor, int disponibles, int alquilados, Integer isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponibles = disponibles;
        this.alquilados = alquilados;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public int getAlquilados() {
        return alquilados;
    }

    public void setAlquilados(int alquilados) {
        this.alquilados = alquilados;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + titulo + ", autor: " + autor + ", disponibles: " + disponibles + ", alquilados: " + alquilados + ", isbn: " + isbn + '}';
    }
    
    
    
}

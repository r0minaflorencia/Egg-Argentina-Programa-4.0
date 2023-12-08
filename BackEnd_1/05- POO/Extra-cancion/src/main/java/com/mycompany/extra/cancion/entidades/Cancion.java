package com.mycompany.extra.cancion.entidades;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Cancion {

    private String titulo, autor;
    private Scanner scan;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void crearCancion() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Título: ");
        titulo = scan.next();
        System.out.print("Autor: ");
        autor = scan.next();
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

    @Override
    public String toString() {
        return "Canción {" + "título: " + titulo + ", autor: " + autor + '}';
    }

}

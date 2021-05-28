package com.bootcamp.practica2d2M;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;
    private boolean estaPrestado;

    public Libro(String titulo, String isbn, String autor, boolean estaPrestado) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.estaPrestado = estaPrestado;
    }

    public Libro() {
    }

    public void prestamo() {
        this.estaPrestado = true;
    }

    public void devolucion(){
        this.estaPrestado = false;
    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.isbn + ", " + this.autor + ", " + this.estaPrestado ;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEstaPrestado() {
        return estaPrestado;
    }

    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }
}

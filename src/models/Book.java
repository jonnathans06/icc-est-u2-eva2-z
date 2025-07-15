package models;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public int compareTo(Book o) {
        int cmpTitulo = o.titulo.compareToIgnoreCase(this.titulo); // Descendente
        if (cmpTitulo != 0) return cmpTitulo;
        return Integer.compare(this.anio, o.anio); // Ascendente
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return anio == book.anio && Objects.equals(titulo, book.titulo) && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anio);
    }

    @Override
    public String toString() {
        return "[Book: " + titulo + ", autor: " + autor + ", año: " + anio + "]";
    }
}

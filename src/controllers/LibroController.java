package controllers;

import models.Book;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LibroController {
    public Map<Book, Book> procesarLibros(List<Book> books){

        Map<Book, Book> mapaLibros = new TreeMap<>();

        for (Book book : books) {
            mapaLibros.put(book, book);
        }

        return mapaLibros;
    }
}

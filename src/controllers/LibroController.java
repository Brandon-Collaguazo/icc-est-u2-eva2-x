package controllers;

import models.Book;
import java.util.*;

public class LibroController {

    public Set<Book> procesarLibros(List<Book> libros) {
        Comparator<Book> ordenPersonalizado = Comparator
            .comparing(Book::getTitulo).reversed()
            .thenComparingInt(Book::getAnio);
        Set<Book> resultado = new TreeSet<>(ordenPersonalizado);
        resultado.addAll(libros);
        return resultado;
    }
}
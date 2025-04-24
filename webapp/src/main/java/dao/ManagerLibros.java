package dao;

import java.util.LinkedList;
import java.util.List;

import classes.Libro;
import classes.LibroImpl;
import enums.tipoEstadoLibro;
import enums.tipoGenero;

public class ManagerLibros {

    // Lista estática de libros
    static List<Libro> listaLibros = new LinkedList<Libro>();

    // Método para obtener todos los libros
    public static List<Libro> getLibros() {

        // Si la lista está vacía, inicializarla con algunos libros de ejemplo
        if (listaLibros.isEmpty()) {

            // Crear algunos libros de ejemplo
            Libro libro1 = new LibroImpl(1, "El Quijote", "Miguel de Cervantes",
                    "Una novela clásica sobre las aventuras de un caballero loco.", tipoGenero.FANTASIA, 10.99f,
                    tipoEstadoLibro.NUEVO, "imagen1.jpg", "imagen2.jpg", "1605-01-01");
            Libro libro2 = new LibroImpl(2, "Cien años de soledad", "Gabriel García Márquez",
                    "Una obra maestra del realismo mágico que narra la historia de la familia Buendía.",
                    tipoGenero.FANTASIA, 12.50f, tipoEstadoLibro.USADO, "imagen3.jpg", "imagen4.jpg", "1967-01-01");

            listaLibros.add(libro1);
            listaLibros.add(libro2);
        }

        return listaLibros;
    }

    // Método para agregar un libro
    public static void addLibro(Libro libro) {
        listaLibros.add(libro);
    }
}

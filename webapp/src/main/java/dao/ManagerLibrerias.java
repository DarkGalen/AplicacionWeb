package dao;

import java.util.LinkedList;
import java.util.List;

import classes.Libreria;
import classes.LibreriaImpl;

public class ManagerLibrerias {

    static List<Libreria> lista = new LinkedList<Libreria>();

    public static List<Libreria> getLibrerias() {
        if (lista.isEmpty()) {
            // Si la lista está vacía, inicializarla con algunos usuarios de ejemplo
            Libreria l1 = new LibreriaImpl(
                    "Biblioteca Central",
                    "biblioteca@central.com",
                    "Ciudad Central",
                    "http://www.bibliotecacentral.com",
                    List.of(101, 102, 103));

            Libreria l2 = new LibreriaImpl(
                "Biblioteca del Norte",
                "biblioteca@norte.com",
                "Ciudad Norte",
                "http://www.bibliotecadelnorte.com",
                List.of(201, 202, 203));

            lista.add(l2);
            lista.add(l1);
        }

        return lista;
    }

    public void addLibreria(Libreria l) {
        lista.add(l);
    }

}

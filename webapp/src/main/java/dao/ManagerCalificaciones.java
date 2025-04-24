package dao;

import java.util.LinkedList;
import java.util.List;

import classes.Calificacion;
import classes.CalificacionImpl;

public class ManagerCalificaciones {

    static List<Calificacion> lista = new LinkedList<Calificacion>();

    public static List<Calificacion> getCalificaciones() {
        if (lista.isEmpty()) {
            // Si la lista está vacía, inicializarla con algunos usuarios de ejemplo
            Calificacion c1 = new CalificacionImpl(
                    1,
                    2,
                    4,
                    "Trato fantástico, muy amable.");

            Calificacion c2 = new CalificacionImpl(
                    2,
                    1,
                    5,
                    "Muy educado y amable.");

            lista.add(c2);
            lista.add(c1);
        }

        return lista;
    }

    public void addCalificacion(Calificacion c) {
        lista.add(c);
    }

}

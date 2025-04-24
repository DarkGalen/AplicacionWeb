package dao;

import java.util.LinkedList;
import java.util.List;

import classes.Mensaje;
import classes.MensajeImpl;

public class ManagerMensajes {

    static List<Mensaje> lista = new LinkedList<Mensaje>();

    public static List<Mensaje> getMensajes() {
        if (lista.isEmpty()) {
            // Si la lista está vacía, inicializarla con algunos usuarios de ejemplo
            Mensaje m1 = new MensajeImpl(
                    1,
                    2,
                    "Hola, ¿cómo estás?",
                    "2023-10-01 10:00:00");

            Mensaje m2 = new MensajeImpl(
                    2,
                    1,
                    "Muy bien, gracias. ¿Y tú?",
                    "2023-10-01 10:05:00");

            lista.add(m2);
            lista.add(m1);
        }

        return lista;
    }

    public void addMensaje(Mensaje m) {
        lista.add(m);
    }

}

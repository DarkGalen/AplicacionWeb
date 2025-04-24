package dao;

import java.util.LinkedList;
import java.util.List;

import classes.Venta;
import classes.VentaImpl;

public class ManagerVentas {

    static List<Venta> lista = new LinkedList<Venta>();

    public static List<Venta> getVentas() {
        if (lista.isEmpty()) {
            // Si la lista está vacía, inicializarla con algunos usuarios de ejemplo
            Venta v1 = new VentaImpl(
                    1,
                    2,
                    3,
                    4,
                    19.99,
                    "2023-10-01");

            Venta v2 = new VentaImpl(
                    2,
                    3,
                    4,
                    5,
                    29.99,
                    "2023-10-02");

            lista.add(v2);
            lista.add(v1);
        }

        return lista;
    }

    public void addVenta(Venta v) {
        lista.add(v);
    }

}

package dao;

import java.util.LinkedList;
import java.util.List;
import classes.Usuario;

public class ManagerUsuariosEliminados {

    static List<Usuario> lista = new LinkedList<Usuario>();

    public static List<Usuario> getUsuarios() {
        return lista;
    }

    public void addUsuario(Usuario u) {
        lista.add(u);
    }
}

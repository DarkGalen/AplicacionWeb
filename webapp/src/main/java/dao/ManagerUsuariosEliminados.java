package dao;

import java.util.LinkedList;
import java.util.List;
import classes.UsuarioEliminado;

public class ManagerUsuariosEliminados {

    static List<UsuarioEliminado> lista = new LinkedList<UsuarioEliminado>();

    public static List<UsuarioEliminado> getUsuarios() {
        return lista;
    }

    public static void addUsuario(UsuarioEliminado u) {
        lista.add(u);
    }
}

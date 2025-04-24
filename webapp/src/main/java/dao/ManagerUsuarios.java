package dao;

import java.util.LinkedList;
import java.util.List;
import classes.Usuario;
import classes.UsuarioImpl;
import enums.tipoGenero;
import enums.tipoMetodoAutenticacion;

public class ManagerUsuarios {

    static List<Usuario> lista = new LinkedList<Usuario>();

    public static List<Usuario> getUsuarios() {
        if (lista.isEmpty()) {
            // Si la lista está vacía, inicializarla con algunos usuarios de ejemplo
            Usuario u1 = new UsuarioImpl(
                    1,
                    "Pablo",
                    "Barcelo",
                    "pabbar@gmail.com",
                    "p3dR0B",
                    123456789,
                    "profilePic.jpg",
                    List.of(tipoGenero.ACCION, tipoGenero.AVENTURAS),
                    List.of(101, 102, 103),
                    tipoMetodoAutenticacion.GOOGLE_OAUTH);
            Usuario u2 = new UsuarioImpl(
                    2,
                    "Ana",
                    "Gomez",
                    "sa@gmail.com",
                    "1234",
                    987654321,
                    "profilePic.jpg",
                    List.of(tipoGenero.ACCION, tipoGenero.AVENTURAS),
                    List.of(101, 102, 103),
                    tipoMetodoAutenticacion.GOOGLE_OAUTH);

            lista.add(u2);
            lista.add(u1);
        }

        return lista;
    }

    public void addUsuario(Usuario u) {
        lista.add(u);
    }

    // Método para eliminar un usuario por su nombre completo (primer y apellido)
    public static boolean eliminarUsuario(String correoElectronico) {
        // Recorrer la lista de usuarios y buscar el usuario con el nombre completo
        for (Usuario usuario : lista) {
            // Compara el nombre completo del usuario (combinando primer y apellido)
            if ((usuario.getCorreoElectronico()).equalsIgnoreCase(correoElectronico)) {
                // Si encontramos al usuario, lo eliminamos
                lista.remove(usuario);
                return true; // Usuario eliminado exitosamente
            }
        }
        return false; // No se encontró al usuario
    }
}

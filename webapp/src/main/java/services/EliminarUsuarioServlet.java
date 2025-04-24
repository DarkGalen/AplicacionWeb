package services;

import dao.ManagerUsuarios;
import dao.ManagerUsuariosEliminados;
import classes.Usuario;
import classes.UsuarioEliminado;
import classes.UsuarioEliminadoImpl;
import enums.tipoMotivoEliminacion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

@WebServlet("/eliminarUsuario")
public class EliminarUsuarioServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String correoElectronico = request.getParameter("correoElectronico");

        if (correoElectronico == null || correoElectronico.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("{\"status\": \"error\", \"message\": \"Correo del usuario no proporcionado.\"}");
            return;
        }

        List<Usuario> usuarios = ManagerUsuarios.getUsuarios();
        Usuario usuarioEncontrado = null;

        Iterator<Usuario> iterator = usuarios.iterator();
        while (iterator.hasNext()) {
            Usuario u = iterator.next();
            if (u.getCorreoElectronico().equalsIgnoreCase(correoElectronico)) {
                usuarioEncontrado = u;
                // Eliminar directamente desde el iterador para evitar ConcurrentModificationException
                iterator.remove();
                break;
            }
        }

        if (usuarioEncontrado != null) {
            UsuarioEliminado eliminado = new UsuarioEliminadoImpl(
                usuarioEncontrado.getIdUsuario(),
                LocalDate.now().toString(),
                tipoMotivoEliminacion.INFRACCION
            );

            ManagerUsuariosEliminados.addUsuario(eliminado);

            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("{\"status\": \"success\", \"message\": \"Usuario eliminado exitosamente.\"}");
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.getWriter().write("{\"status\": \"error\", \"message\": \"Usuario no encontrado.\"}");
        }
    }
}

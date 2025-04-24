package services;

import dao.ManagerUsuarios;
import classes.Usuario;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/iniciarSesion")
public class IniciarSesionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario (correoElectronico y contraseña)
        String email = request.getParameter("correoElectronico");
        String contrasenya = request.getParameter("contrasenya");

        // Obtener la lista de usuarios desde el ManagerUsuarios
        List<Usuario> usuarios = ManagerUsuarios.getUsuarios();
        
        // Inicializar la variable para verificar el usuario
        boolean autenticado = false;
        Usuario usuarioAutenticado = null;

        // Verificar si el usuario y la contraseña coinciden
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreoElectronico().equals(email) && usuario.getContrasenya().equals(contrasenya)) {
                autenticado = true;
                usuarioAutenticado = usuario;
                break;
            }
        }

        // Configurar la respuesta
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Si el usuario es autenticado, responder con un mensaje de éxito
        if (autenticado) {
            response.getWriter().write("{\"status\": \"success\", \"message\": \"Inicio de sesión exitoso.\"}");
        } else {
            // Si las credenciales son incorrectas, responder con un mensaje de error
            response.getWriter().write("{\"status\": \"error\", \"message\": \"Credenciales incorrectas.\"}");
        }
    }
}

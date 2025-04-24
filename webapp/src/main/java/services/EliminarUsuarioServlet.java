package services;

import dao.ManagerUsuarios;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/eliminarUsuario")
public class EliminarUsuarioServlet extends HttpServlet {

    // Método para manejar las solicitudes POST
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener el parámetro 'nombre' desde la solicitud (puede ser un parámetro GET o POST)
        String correoElectronico = request.getParameter("correoElectronico");

        // Verificar si se ha proporcionado un 'correo' válido
        if (correoElectronico == null || correoElectronico.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST); // 400
            response.getWriter().write("{\"status\": \"error\", \"message\": \"Correo del usuario no proporcionado.\"}");
            return;
        }

        // Llamar al ManagerUsuarios para eliminar al usuario con ese correo electrónico
        boolean eliminado = ManagerUsuarios.eliminarUsuario(correoElectronico);

        if (eliminado) {
            // Responder con un mensaje de éxito
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("{\"status\": \"success\", \"message\": \"Usuario eliminado exitosamente.\"}");
        } else {
            // Si no se encuentra el usuario o ocurre un error en la eliminación
            response.setStatus(HttpServletResponse.SC_NOT_FOUND); // 404
            response.getWriter().write("{\"status\": \"error\", \"message\": \"Usuario no encontrado.\"}");
        }
    }
}

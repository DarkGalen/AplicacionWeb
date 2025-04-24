package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Calificacion;
import classes.CalificacionImpl;
import dao.ManagerCalificaciones;

@WebServlet("/calificarUsuario")
public class CalificarUsuarioServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // Lista temporal para almacenar artículos añadidos dinámicamente
    //private static List<Usuario> listaDinamica = ManagerUsuarios.getUsuarios();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Configurar codificación para evitar problemas con acentos
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // Obtener parámetros del formulario
        int idCalificador = request.getParameter("idCalificador") != null ? Integer.parseInt(request.getParameter("idCalificador")) : -1;
        int idCalificado = request.getParameter("idCalificado") != null ? Integer.parseInt(request.getParameter("idCalificado")) : -1;
        int calificacion = request.getParameter("calificacion") != null ? Integer.parseInt(request.getParameter("calificacion")) : -1;
        String comentario = request.getParameter("comentario");

        // Crear nueva calificación
        Calificacion nuevo = new CalificacionImpl(idCalificador, idCalificado, calificacion, comentario);

        // Usar directamente el método del DAO como repositorio
        ManagerCalificaciones manager = new ManagerCalificaciones();
        manager.addCalificacion(nuevo);

        // Confirmación
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{");
        out.println("\"status\": \"success\",");
        out.println("\"message\": \"Calificación enviada correctamente\",");
        out.println("\"data\": {");
        out.println("\"idCalificador\": " + idCalificador + ",");
        out.println("\"idCalificado\": " + idCalificado + ",");
        out.println("\"calificacion\": " + calificacion + ",");
        out.println("\"comentario\": \"" + comentario + "\"");
        out.println("}");
        out.println("}");
    }
}

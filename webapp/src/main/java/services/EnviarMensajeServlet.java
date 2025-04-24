package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Mensaje;
import classes.MensajeImpl;
import dao.ManagerMensajes;

@WebServlet("/enviarMensaje")
public class EnviarMensajeServlet extends HttpServlet {

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
        int idRemitente = request.getParameter("idRemitente") != null ? Integer.parseInt(request.getParameter("idRemitente")) : -1;
        int idDestinatario = request.getParameter("idDestinatario") != null ? Integer.parseInt(request.getParameter("idDestinatario")) : -1;
        String contenidoMensaje = request.getParameter("mensaje");

        // Crear nuevo usuario
        java.time.LocalDateTime fechaHoraActual = java.time.LocalDateTime.now();
        Mensaje nuevo = new MensajeImpl(idRemitente, idDestinatario, contenidoMensaje, fechaHoraActual.toString());

        // Usar directamente el método del DAO como repositorio
        ManagerMensajes manager = new ManagerMensajes();
        manager.addMensaje(nuevo);

        // Confirmación
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{");
        out.println("\"status\": \"success\",");
        out.println("\"message\": \"Mensaje enviado correctamente\",");
        out.println("\"data\": {");
        out.println("\"idRemitente\": " + idRemitente + ",");
        out.println("\"idDestinatario\": " + idDestinatario + ",");
        out.println("\"contenidoMensaje\": \"" + contenidoMensaje + "\",");
        out.println("\"fechaHora\": \"" + fechaHoraActual + "\"");
        out.println("}");
        out.println("}");
    }
}

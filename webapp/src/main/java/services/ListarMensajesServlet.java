package services;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import classes.Mensaje;
import dao.ManagerMensajes;

@WebServlet("/listarMensajes")
public class ListarMensajesServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // Lista temporal para almacenar artículos añadidos dinámicamente
    //private static List<Usuario> listaDinamica = ManagerUsuarios.getUsuarios();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener la lista de mensajes desde ManagerMensajes
        List<Mensaje> mensajes = ManagerMensajes.getMensajes();
        
        // Establecer el tipo de contenido como JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Crear el array JSON
        JSONArray mensajesJsonArray = new JSONArray();
        
        for (Mensaje mensaje : mensajes) {
            // Crear un objeto JSON para cada mesnaje
            JSONObject mensajeJson = new JSONObject();
            mensajeJson.put("idRemitente", mensaje.getIdRemitente());
            mensajeJson.put("idDestinatario", mensaje.getIdDestinatario());
            mensajeJson.put("contenidoMensaje", mensaje.getContenidoMensaje());
            mensajeJson.put("fecha", mensaje.getFechaEnvio());

            // Añadir el mensaje al array de mensajes
            mensajesJsonArray.put(mensajeJson);
        }
        
        // Enviar la respuesta JSON
        response.getWriter().write(mensajesJsonArray.toString());
    }
}

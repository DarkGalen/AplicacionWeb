package services;

import dao.ManagerCalificaciones;
import classes.Calificacion;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listarCalificaciones")
public class ListarCalificacionesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener la lista de calificaciones desde ManagerCalificaciones
        //List<Libro> libros = ManagerLibros.getLibros();
        
        // Establecer el tipo de contenido como JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Crear el array JSON
        JSONArray calificacionesJsonArray = new JSONArray();
        
        for (Calificacion calificacion : ManagerCalificaciones.getCalificaciones()) {
            // Crear un objeto JSON para cada calificacion
            JSONObject calificacionJson = new JSONObject();
            
            calificacionJson.put("idCalificador", calificacion.getIdCalificador());
            calificacionJson.put("idCalificado", calificacion.getIdCalificado());
            calificacionJson.put("puntuacion", calificacion.getCalificacion());
            calificacionJson.put("comentario", calificacion.getComentario());

            // Añadir el libro al array de libros
            calificacionesJsonArray.put(calificacionJson);
        }
        
        // Enviar la respuesta JSON
        response.getWriter().write(calificacionesJsonArray.toString());
    }
}

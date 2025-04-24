package services;

import dao.ManagerLibrerias;
import classes.Libreria;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

@WebServlet("/listarLibrerias")
public class ListarLibreriasServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener la lista de librerías desde el ManagerUsuarios
        List<Libreria> librerias = ManagerLibrerias.getLibrerias();

        // Configurar la respuesta
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

         // Crear el array JSON
        JSONArray libreriasJsonArray = new JSONArray();
        
        for (Libreria libreria : librerias) {
            // Crear un objeto JSON para cada libro
            JSONObject libreriaJson = new JSONObject();
            libreriaJson.put("Nombre:", libreria.getNombre());
            libreriaJson.put("Correo Electronico:", libreria.getCorreoElectronico());
            libreriaJson.put("Ubicacion:", libreria.getUbicacion());
            libreriaJson.put("Url Sitio Web:", libreria.getUrlSitioWeb());

            // Añadir el libro al array de libros
            libreriasJsonArray.put(libreriaJson);
        }
        
        // Enviar la respuesta JSON
        response.getWriter().write(libreriasJsonArray.toString());
    }
}

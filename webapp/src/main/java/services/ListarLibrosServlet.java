package services;

import dao.ManagerLibros;
import classes.Libro;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listarLibros")
public class ListarLibrosServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener la lista de libros desde ManagerLibros
        List<Libro> libros = ManagerLibros.getLibros();
        
        // Establecer el tipo de contenido como JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Crear el array JSON
        JSONArray librosJsonArray = new JSONArray();
        
        for (Libro libro : libros) {
            // Crear un objeto JSON para cada libro
            JSONObject libroJson = new JSONObject();
            libroJson.put("id", libro.getIdLibro());
            libroJson.put("titulo", libro.getTitulo());
            libroJson.put("autor", libro.getAutor());
            libroJson.put("descripcion", libro.getSinopsis());
            libroJson.put("genero", libro.getGenero().toString());
            libroJson.put("precio", libro.getPrecio());
            libroJson.put("estado", libro.getEstado().toString());
            libroJson.put("imagenPortada", libro.getImagenUno());
            libroJson.put("imagenDetalle", libro.getImagenDos());
            libroJson.put("fechaPublicacion", libro.getFechaPublicacion());

            // Añadir el libro al array de libros
            librosJsonArray.put(libroJson);
        }
        
        // Enviar la respuesta JSON
        response.getWriter().write(librosJsonArray.toString());
    }
}

package services;

import dao.ManagerUsuarios;
import classes.Usuario;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listarUsuarios")
public class ListarUsuariosServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener la lista de usuarios desde ManagerUsuarios
        List<Usuario> usuarios = ManagerUsuarios.getUsuarios();
        
        // Establecer el tipo de contenido como JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Crear el array JSON
        JSONArray usuariosJsonArray = new JSONArray();
        
        for (Usuario usuario : usuarios) {
            // Crear un objeto JSON para cada usuario
            JSONObject usuarioJson = new JSONObject();
            usuarioJson.put("id", usuario.getIdUsuario());
            usuarioJson.put("nombre", usuario.getNombre());
            usuarioJson.put("apellido", usuario.getApellidos());
            usuarioJson.put("email", usuario.getCorreoElectronico());
            usuarioJson.put("contraseña", usuario.getContrasenya());
            usuarioJson.put("telefono", usuario.getNumeroTelefono());
            usuarioJson.put("fotoPerfil", usuario.getFotoPerfil());
            usuarioJson.put("generos preferidos", usuario.getGenerosPreferidos());
            usuarioJson.put("metodoAutenticacion", usuario.getMetodoAutenticacion());

            // Añadir el usuario al array de usuarios
            usuariosJsonArray.put(usuarioJson);
        }
        
        // Enviar la respuesta JSON
        response.getWriter().write(usuariosJsonArray.toString());
    }
}

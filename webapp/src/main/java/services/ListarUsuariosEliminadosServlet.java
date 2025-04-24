package services;

import dao.ManagerUsuariosEliminados;
import classes.UsuarioEliminado;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listarUsuariosEliminados")
public class ListarUsuariosEliminadosServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener la lista de usuarios desde ManagerUsuarios
        List<UsuarioEliminado> usuarios = ManagerUsuariosEliminados.getUsuarios();
        
        // Establecer el tipo de contenido como JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Crear el array JSON
        JSONArray usuariosJsonArray = new JSONArray();
        
        for (UsuarioEliminado usuario : usuarios) {
            // Crear un objeto JSON para cada usuario
            JSONObject usuarioJson = new JSONObject();
            usuarioJson.put("id", usuario.getIdUsuario());
            usuarioJson.put("fechaEliminacion", usuario.getFechaEliminacion());
            usuarioJson.put("motivoEliminacion", usuario.getMotivoEliminacion().toString());

            // Añadir el usuario al array de usuarios
            usuariosJsonArray.put(usuarioJson);
        }
        
        // Enviar la respuesta JSON
        response.getWriter().write(usuariosJsonArray.toString());
    }
}

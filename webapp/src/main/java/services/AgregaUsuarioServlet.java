package services;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Usuario;
import classes.UsuarioImpl;
import dao.ManagerUsuarios;
import enums.tipoGenero;
import enums.tipoMetodoAutenticacion;

@WebServlet("/agregaUsuario")
public class AgregaUsuarioServlet extends HttpServlet {

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
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String correoElectronico = request.getParameter("correoElectronico");
        String contrasenya = request.getParameter("contrasenya");
        int numeroTelefono = Integer.parseInt(request.getParameter("numeroTelefono"));
        String fotoPerfil = request.getParameter("fotoPerfil");
        String[] generosPreferidosArray = request.getParameterValues("generosPreferidos[]");
        // Convertir los géneros seleccionados en una lista de tipos Genero
        List<tipoGenero> generosPreferidos = Arrays.asList(
                Arrays.stream(generosPreferidosArray)
                        .map(tipoGenero::valueOf) // Convertir el string en un valor del enum Genero
                        .toArray(tipoGenero[]::new));

        tipoMetodoAutenticacion metodoAutenticacion = tipoMetodoAutenticacion.valueOf(request.getParameter("metodoAutenticacion"));

        String librosEnVentaStr = request.getParameter("librosEnVenta");
        // Convertir los libros en venta seleccionados en una lista de enteros
        List<Integer> librosEnVenta = Arrays.asList(
                Arrays.stream(librosEnVentaStr.split(",")) // Separar los libros por comas
                        .map(Integer::parseInt) // Convertir el string en un entero
                        .toArray(Integer[]::new)); // Convertir a un array de enteros

        // Crear nuevo usuario
        Usuario nuevo = new UsuarioImpl(idUsuario, nombre, apellidos, correoElectronico, contrasenya, numeroTelefono, fotoPerfil,
                generosPreferidos, librosEnVenta, metodoAutenticacion);

        // Usar directamente el método del DAO como repositorio
        ManagerUsuarios manager = new ManagerUsuarios();
        manager.addUsuario(nuevo);

        // Confirmación
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Usuario añadido correctamente</h3>");
        out.println("<p><strong>Nombre:</strong> " + nombre + "</p>");
        out.println("<p><strong>Apellidos:</strong> " + apellidos + "</p>");
        out.println("<p><strong>Correo Electrónico:</strong> " + correoElectronico + "</p>");
        out.println("<p><strong>Contraseña:</strong> " + contrasenya + "</p>");
        out.println("<p><strong>Número de Teléfono:</strong> " + numeroTelefono + "</p>");
        out.println("<p><strong>Foto de Perfil:</strong> " + fotoPerfil + "</p>");
        out.println("<p><strong>Géneros Preferidos:</strong> " + generosPreferidos + "</p>");
        out.println("<p><strong>Método de Autenticación:</strong> " + metodoAutenticacion + "</p>");
        out.println("<p><strong>Libros en Venta:</strong> " + librosEnVentaStr + "</p>");
        out.println("<a href=\"index.jsp\">Volver al inicio</a>");
        out.println("</body></html>");
    }
}

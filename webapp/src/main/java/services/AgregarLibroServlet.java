package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enums.tipoGenero;
import enums.tipoEstadoLibro;
import classes.Libro;
import classes.LibroImpl;
import dao.ManagerLibros;

@WebServlet("/agregarLibro")
public class AgregarLibroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Configurar codificación para evitar problemas con acentos
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // Obtener parámetros del formulario
        int idLibro = request.getParameter("idLibro") != null
                ? Integer.parseInt(request.getParameter("idLibro"))
                : -1;
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String sinopsis = request.getParameter("sinopsis");
        String generoStr = request.getParameter("genero");
        tipoGenero genero = tipoGenero.valueOf(generoStr.toUpperCase());
        Float precio = request.getParameter("precio") != null
                ? Float.parseFloat(request.getParameter("precio"))
                : 0.0f;
        String estadoStr = request.getParameter("estado");
        tipoEstadoLibro estado = tipoEstadoLibro.valueOf(estadoStr.toUpperCase());
        String imagenUno = request.getParameter("imagenUno");
        String imagenDos = request.getParameter("imagenDos");
        String fechaPublicacion = request.getParameter("fechaPublicacion");

        // Crear nuevo libro
        Libro nuevoLibro = new LibroImpl(idLibro, titulo, autor, sinopsis, genero, precio, estado, imagenUno, imagenDos,
                fechaPublicacion);

        // Usar directamente el método del DAO como repositorio
        ManagerLibros.addLibro(nuevoLibro);

        // Confirmación
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{");
        out.println("\"status\": \"success\",");
        out.println("\"message\": \"Libro agregado correctamente\",");
        out.println("\"data\": {");
        out.println("\"idLibro\": " + idLibro + ",");
        out.println("\"titulo\": \"" + titulo + "\",");
        out.println("\"autor\": \"" + autor + "\",");
        out.println("\"sinopsis\": \"" + sinopsis + "\",");
        out.println("\"genero\": \"" + genero + "\",");
        out.println("\"precio\": " + precio + ",");
        out.println("\"estado\": \"" + estado + "\",");
        out.println("\"imagenUno\": \"" + imagenUno + "\",");
        out.println("\"imagenDos\": \"" + imagenDos + "\",");
        out.println("\"fechaPublicacion\": \"" + fechaPublicacion + "\"");
        out.println("}");
        out.println("}");
    }
}
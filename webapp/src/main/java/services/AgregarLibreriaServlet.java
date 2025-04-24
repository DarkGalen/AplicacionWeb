package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Libreria;
import classes.LibreriaImpl;
import dao.ManagerLibrerias;
import java.util.List;

@WebServlet("/agregarLibreria")
public class AgregarLibreriaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Configurar codificación para evitar problemas con acentos
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // Obtener parámetros del formulario
        String nombre = request.getParameter("nombre");
        String correoElectronico = request.getParameter("correoElectronico");
        String ubicacion = request.getParameter("ubicacion");
        String urlSitioWeb = request.getParameter("urlSitioWeb");
        List<Integer> catalogoLibros = List.of(request.getParameter("catalogoLibros").split(","))
                           .stream()
                           .map(Integer::parseInt)
                           .toList();

        // Validar parámetros
        if (nombre == null || nombre.isEmpty() || correoElectronico == null || correoElectronico.isEmpty() ||
            ubicacion == null || ubicacion.isEmpty() || urlSitioWeb == null || urlSitioWeb.isEmpty() ||
            catalogoLibros == null || catalogoLibros.isEmpty()) {
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            out.println("{");
            out.println("\"status\": \"error\",");
            out.println("\"message\": \"Todos los campos son obligatorios\"");
            out.println("}");
            return;
        }

        // Crear nueva librería
        Libreria nuevaLibreria = new LibreriaImpl(nombre, correoElectronico, ubicacion, urlSitioWeb, catalogoLibros);

        // Usar directamente el método del DAO como repositorio
        ManagerLibrerias manager = new ManagerLibrerias();
        manager.addLibreria(nuevaLibreria);

        // Confirmación
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{");
        out.println("\"status\": \"success\",");
        out.println("\"message\": \"Librería agregada correctamente\",");
        out.println("\"data\": {");
        out.println("\"nombre\": \"" + nombre + "\",");
        out.println("\"correoElectronico\": \"" + correoElectronico + "\",");
        out.println("\"ubicacion\": \"" + ubicacion + "\",");
        out.println("\"urlSitioWeb\": \"" + urlSitioWeb + "\",");
        out.println("\"catalogoLibros\": \"" + catalogoLibros + "\"");
        out.println("}");
        out.println("}");
    }
}

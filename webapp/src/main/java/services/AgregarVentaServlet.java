package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Venta;
import classes.VentaImpl;
import dao.ManagerVentas;

@WebServlet("/agregarVenta")
public class AgregarVentaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Configurar codificación para evitar problemas con acentos
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // Obtener parámetros del formulario
        int idTransaccion = Integer.parseInt(request.getParameter("idTransaccion"));
        int idComprador = Integer.parseInt(request.getParameter("idComprador"));
        int idVendedor = Integer.parseInt(request.getParameter("idVendedor"));
        int idLibroVendido = Integer.parseInt(request.getParameter("idLibroVendido"));
        double precioVenta = Double.parseDouble(request.getParameter("precioVenta"));
        String fechaVenta = request.getParameter("fechaVenta");

        // Validar parámetros
        if (idTransaccion <= 0 || idComprador <= 0 || idVendedor <= 0 || idLibroVendido <= 0) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Los IDs deben ser mayores a 0.");
            return;
        }

        if (precioVenta <= 0) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "El precio de venta debe ser mayor a 0.");
            return;
        }

        if (fechaVenta == null || fechaVenta.trim().isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "La fecha de venta no puede estar vacía.");
            return;
        }

        // Crear nueva venta
        Venta nuevaVenta = new VentaImpl(idTransaccion, idComprador, idVendedor, idLibroVendido, precioVenta, fechaVenta);

        // Guardar la venta en la base de datos o en la lógica de negocio
        ManagerVentas manager = new ManagerVentas();
        manager.addVenta(nuevaVenta);

        // Confirmación
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{");
        out.println("\"status\": \"success\",");
        out.println("\"message\": \"Venta agregada correctamente\",");
        out.println("\"data\": {");
        out.println("\"idTransaccion\": " + idTransaccion + ",");
        out.println("\"idComprador\": " + idComprador + ",");
        out.println("\"idVendedor\": " + idVendedor + ",");
        out.println("\"idLibroVendido\": " + idLibroVendido + ",");
        out.println("\"precioVenta\": " + precioVenta + ",");
        out.println("\"fechaVenta\": \"" + fechaVenta + "\"");
        out.println("}");
        out.println("}");
    }
}

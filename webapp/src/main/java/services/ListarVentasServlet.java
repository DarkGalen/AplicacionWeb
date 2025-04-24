package services;

import dao.ManagerVentas;
import classes.Venta;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

@WebServlet("/listarVentas")
public class ListarVentasServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener la lista de ventas desde el ManagerLibrerias
        List<Venta> ventas = ManagerVentas.getVentas();

        // Configurar la respuesta
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Crear el array JSON
        JSONArray ventasJsonArray = new JSONArray();
        
        for (Venta venta : ventas) {
            // Crear un objeto JSON para cada venta
            JSONObject ventaJson = new JSONObject();
            ventaJson.put("ID Transacción", venta.getIdTransaccion());
            ventaJson.put("ID Comprador", venta.getIdComprador());
            ventaJson.put("ID Vendedor", venta.getIdVendedor());
            ventaJson.put("ID Libro Vendido", venta.getIdLibroVendido());
            ventaJson.put("Precio Venta", venta.getPrecioVenta());
            ventaJson.put("Fecha Venta", venta.getFechaVenta());

            // Añadir la venta al array de ventas
            ventasJsonArray.put(ventaJson);
        }
        
        // Enviar la respuesta JSON
        response.getWriter().write(ventasJsonArray.toString());
    }
}

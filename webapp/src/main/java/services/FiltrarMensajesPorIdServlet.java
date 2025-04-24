package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import dao.ManagerMensajes;
import classes.Mensaje;



@WebServlet(urlPatterns = "/filtrarMensajesPorId")
public class FiltrarMensajesPorIdServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		resp.setHeader("Cache-Control", "no-cache");
		resp.setHeader("Cache-Control", "no-store");
		PrintWriter writer;
		
		JSONArray arrayMensajes = new JSONArray();
		int id = Integer.parseInt(req.getParameter("id"));
		
		try {
			writer = resp.getWriter();
			
			for (Mensaje mensaje : ManagerMensajes.getMensajes()){
				
				int idRemitente = mensaje.getIdRemitente();
				if(idRemitente == id) {
					JSONObject objetoJSON = new JSONObject();

					objetoJSON.put("idRemitente",mensaje.getIdRemitente());
					objetoJSON.put("idDestinatario",mensaje.getIdDestinatario());
					objetoJSON.put("mensaje",mensaje.getContenidoMensaje());
					objetoJSON.put("fecha",mensaje.getFechaEnvio());	
					
					arrayMensajes.put(objetoJSON);
				}

				int idDestinatario = mensaje.getIdDestinatario();
				if(idDestinatario == id) {
					JSONObject objetoJSON = new JSONObject();

					objetoJSON.put("idRemitente",mensaje.getIdRemitente());
					objetoJSON.put("idDestinatario",mensaje.getIdDestinatario());
					objetoJSON.put("mensaje",mensaje.getContenidoMensaje());
					objetoJSON.put("fecha",mensaje.getFechaEnvio());	
					
					arrayMensajes.put(objetoJSON);
				}
			}
			
			JSONObject 	respuesta = new JSONObject();
			
			if (!arrayMensajes.isEmpty()) {
				respuesta.put("cod", "ok");
				respuesta.put("msg", "ok");	
			} 
			else 
			{
				respuesta.put("cod", "ERROR");
				respuesta.put("msg", "Listado vacio");
			}
			
			respuesta.put("res", arrayMensajes);

			writer.write(respuesta.toString());
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
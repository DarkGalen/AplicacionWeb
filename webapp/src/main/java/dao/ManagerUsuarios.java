package dao;

import java.util.LinkedList;
import java.util.List;

import classes.Usuario;
import classes.UsuarioImpl;
import enums.tipoGenero;

public class ManagerUsuarios {
	
	static List<Usuario> lista = new LinkedList<Usuario>();
	public static List<Usuario> getUsuarios(){
		
        Usuario u1 = new UsuarioImpl(
            "Pablo", 
            "Barcelo", 
            "pabbar@gmail.com", 
            "p3dR0B", 
            123456789, 
            "profilePic.jpg", 
            List.of(tipoGenero.ACCION, tipoGenero.AVENTURAS), 
            List.of(101, 102, 103), 
            "OAuth"
        );
        Usuario u2 = new UsuarioImpl(
            "Ana", 
            "Gomez", 
            "sa@gmail.com",
            "1234",
            987654321,
            "profilePic.jpg",
            List.of(tipoGenero.ACCION, tipoGenero.AVENTURAS),
            List.of(101, 102, 103),
            "OAuth"
        );
		
		lista.add(u2);
		lista.add(u1);
		
		return lista;
	}
	public void addUsuario(Usuario u){
		lista.add(u);
		
	}
}

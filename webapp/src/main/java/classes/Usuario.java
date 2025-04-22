package classes;

import java.util.List;
import enums.tipoGenero;

public interface Usuario {

	String getNombre();

	void setNombre(String nombre);

	String getApellidos();

	void setApellidos(String apellidos);

	String getCorreoElectronico();

	void setCorreoElectronico(String correoElectronico);

	String getContrasenya();

	void setContrasenya(String contrasenya);
    
    int getNumeroTelefono();

    void setNumeroTelefono(int numeroTelefono);

    String getFotoPerfil();

    void setFotoPerfil(String fotoPerfil);

    List<tipoGenero> getGenerosPreferidos();

    void setGenerosPreferidos(List<tipoGenero> generosPreferidos);

    List<Integer> getLibrosEnVenta();

    void setLibrosEnVenta(List<Integer> librosEnVenta);

    String getMetodoAutenticacion();

    void setMetodoAutenticacion(String metodoAutenticacion);
  
}

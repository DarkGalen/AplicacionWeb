package classes;

import enums.tipoGenero;
import enums.tipoEstadoLibro;

public interface Libro {
	
	void setIdLibro(Integer idLibro);
	
	Integer getIdLibro();
	
	void setTitulo(String titulo);
	
	String getTitulo();

    void setAutor(String autor);

    String getAutor();

	void setSinopsis(String sinopsis);
	
	String getSinopsis();

    void setGenero(tipoGenero genero);

    tipoGenero getGenero();
	
	void setPrecio(Float precio);
	
	Float getPrecio();
	
    void setEstado(tipoEstadoLibro estado);

    tipoEstadoLibro getEstado();

    void setImagenUno(String imagenUno);

    String getImagenUno();

    void setImagenDos(String imagenDos);

    String getImagenDos();

    void setFechaPublicacion(String fechaPublicacion);

    String getFechaPublicacion();

}
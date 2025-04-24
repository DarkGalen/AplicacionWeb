package classes;

import enums.tipoGenero;
import enums.tipoEstadoLibro;

public class LibroImpl implements Libro {

    private Integer idLibro;
    private String titulo, autor, sinopsis, imagenUno, imagenDos, fechaPublicacion;
    private tipoGenero genero;
    private Float precio;
    private tipoEstadoLibro estado;

	public LibroImpl(Integer idLibro, String titulo, String autor, String sinopsis, tipoGenero genero, Float precio, tipoEstadoLibro estado, String imagenUno, String imagenDos, String fechaPublicacion) {
		super();
		this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.precio = precio;
        this.estado = estado;
        this.imagenUno = imagenUno;
        this.imagenDos = imagenDos;
        this.fechaPublicacion = fechaPublicacion;
	}
	

	// ----------------------------- Metodos Get y Set -----------------------------------------//

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public tipoGenero getGenero() {
        return genero;
    }

    public void setGenero(tipoGenero genero) {
        this.genero = genero;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public tipoEstadoLibro getEstado() {
        return estado;
    }

    public void setEstado(tipoEstadoLibro estado) {
        this.estado = estado;
    }

    public String getImagenUno() {
        return imagenUno;
    }

    public void setImagenUno(String imagenUno) {
        this.imagenUno = imagenUno;
    }

    public String getImagenDos() {
        return imagenDos;
    }

    public void setImagenDos(String imagenDos) {
        this.imagenDos = imagenDos;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
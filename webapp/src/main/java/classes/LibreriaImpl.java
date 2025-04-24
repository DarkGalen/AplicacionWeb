package classes;

import java.util.List;

public class LibreriaImpl implements Libreria {
    private String nombre, correoElectronico, ubicacion, urlSitioWeb;
    private List<Integer> catalogoLibros;

    public LibreriaImpl(String nombre, String correoElectronico, String ubicacion, String urlSitioWeb,
            List<Integer> catalogoLibros) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.ubicacion = ubicacion;
        this.urlSitioWeb = urlSitioWeb;
        this.catalogoLibros = catalogoLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUrlSitioWeb() {
        return urlSitioWeb;
    }

    public void setUrlSitioWeb(String urlSitioWeb) {
        this.urlSitioWeb = urlSitioWeb;
    }

    public List<Integer> getCatalogoLibros() {
        return catalogoLibros;
    }

    public void setCatalogoLibros(List<Integer> catalogoLibros) {
        this.catalogoLibros = catalogoLibros;
    }
}

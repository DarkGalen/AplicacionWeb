package classes;

import java.util.List;

public interface Libreria {
    String getNombre();

    void setNombre(String nombre);

    String getCorreoElectronico();

    void setCorreoElectronico(String correoElectronico);

    String getUbicacion();

    void setUbicacion(String ubicacion);

    String getUrlSitioWeb();

    void setUrlSitioWeb(String urlSitioWeb);

    List<Integer> getCatalogoLibros();

    void setCatalogoLibros(List<Integer> catalogoLibros);
}

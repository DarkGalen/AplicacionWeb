package classes;

import java.util.List;
import enums.tipoGenero;
import enums.tipoMetodoAutenticacion;

public class UsuarioImpl implements Usuario {

    private String nombre, apellidos, correoElectronico, contrasenya, fotoPerfil;
    private tipoMetodoAutenticacion metodoAutenticacion;
    private List<Integer> librosEnVenta;
    private List<tipoGenero> generosPreferidos;
    private int idUsuario, numeroTelefono;

    public UsuarioImpl(int idUsuario, String nombre, String apellidos, String correoElectronico, String contrasenya,
            int numeroTelefono, String fotoPerfil, List<tipoGenero> generosPreferidos, List<Integer> librosEnVenta,
            tipoMetodoAutenticacion metodoAutenticacion) {
        super();
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.contrasenya = contrasenya;
        this.numeroTelefono = numeroTelefono;
        this.fotoPerfil = fotoPerfil;
        this.generosPreferidos = generosPreferidos;
        this.librosEnVenta = librosEnVenta;
        this.metodoAutenticacion = metodoAutenticacion;
    }

    // ----------------------------- Metodos Get y Set
    // -----------------------------------------//
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;

    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;

    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public List<tipoGenero> getGenerosPreferidos() {
        return generosPreferidos;
    }

    public void setGenerosPreferidos(List<tipoGenero> generosPreferidos) {
        this.generosPreferidos = generosPreferidos;
    }

    public List<Integer> getLibrosEnVenta() {
        return librosEnVenta;
    }

    public void setLibrosEnVenta(List<Integer> librosEnVenta) {
        this.librosEnVenta = librosEnVenta;
    }

    public tipoMetodoAutenticacion getMetodoAutenticacion() {
        return metodoAutenticacion;
    }

    public void setMetodoAutenticacion(tipoMetodoAutenticacion metodoAutenticacion) {
        this.metodoAutenticacion = metodoAutenticacion;
    }
}
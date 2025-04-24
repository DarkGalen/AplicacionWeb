package classes;

import enums.tipoMotivoEliminacion;

public class UsuarioEliminadoImpl implements UsuarioEliminado {
    private int idUsuario;
    private String fechaEliminacion;
    private tipoMotivoEliminacion motivoEliminacion;

    public UsuarioEliminadoImpl(int idUsuario, String fechaEliminacion, tipoMotivoEliminacion motivoEliminacion) {
        this.idUsuario = idUsuario;
        this.fechaEliminacion = fechaEliminacion;
        this.motivoEliminacion = motivoEliminacion;
    }

    // Getters and Setters for all fields
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(String fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public tipoMotivoEliminacion getMotivoEliminacion() {
        return motivoEliminacion;
    }

    public void setMotivoEliminacion(tipoMotivoEliminacion motivoEliminacion) {
        this.motivoEliminacion = motivoEliminacion;
    }
    
}

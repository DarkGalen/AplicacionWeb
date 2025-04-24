package classes;

import enums.tipoMotivoEliminacion;

public interface UsuarioEliminado {
    int getIdUsuario();

    void setIdUsuario(int idUsuario);

    String getFechaEliminacion();

    void setFechaEliminacion(String fechaEliminacion);

    tipoMotivoEliminacion getMotivoEliminacion();

    void setMotivoEliminacion(tipoMotivoEliminacion motivoEliminacion);
}

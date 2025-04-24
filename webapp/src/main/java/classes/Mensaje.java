package classes;

public interface Mensaje {
    
    String getContenidoMensaje();

    void setContenidoMensaje(String contenidoMensaje);

    String getFechaEnvio();

    void setFechaEnvio(String fechaEnvio);

    int getIdRemitente();

    void setIdRemitente(int idRemitente);

    int getIdDestinatario();

    void setIdDestinatario(int idDestinatario);
    
}

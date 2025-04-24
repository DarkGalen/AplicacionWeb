package classes;

public class MensajeImpl implements Mensaje {
    private String contenidoMensaje, fechaEnvio;
    private int idRemitente, idDestinatario;

    public MensajeImpl(int idRemitente, int idDestinatario, String contenidoMensaje, String fechaEnvio) {
        super();
        this.idRemitente = idRemitente;
        this.idDestinatario = idDestinatario;
        this.contenidoMensaje = contenidoMensaje;
        this.fechaEnvio = fechaEnvio;
    }

    // ----------------------------- Metodos Get y Set -----------------------------------------//
    public String getContenidoMensaje() {
        return contenidoMensaje;
    }

    public void setContenidoMensaje(String contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(int idRemitente) {
        this.idRemitente = idRemitente;
    }

    public int getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(int idDestinatario) {
        this.idDestinatario = idDestinatario;
    }
}

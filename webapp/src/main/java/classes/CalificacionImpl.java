package classes;

public class CalificacionImpl implements Calificacion {

    private int idCalificador, idCalificado, calificacion;
    private String comentario;

    public CalificacionImpl(int idCalificador, int idCalificado, int calificacion, String comentario) {
        super();
        this.idCalificador = idCalificador;
        this.idCalificado = idCalificado;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    // ----------------------------- Metodos Get y Set
    // -----------------------------------------//

    public int getIdCalificador() {
        return idCalificador;
    }

    public void setIdCalificador(int idCalificador) {
        this.idCalificador = idCalificador;
    }

    public int getIdCalificado() {
        return idCalificado;
    }

    public void setIdCalificado(int idCalificado) {
        this.idCalificado = idCalificado;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
package classes;

public class VentaImpl implements Venta {
    private int idTransaccion, idComprador, idVendedor, idLibroVendido;
    private double precioVenta;
    private String fechaVenta;

    public VentaImpl(int idTransaccion, int idComprador, int idVendedor, int idLibroVendido, double precioVenta,
            String fechaVenta) {
        this.idTransaccion = idTransaccion;
        this.idComprador = idComprador;
        this.idVendedor = idVendedor;
        this.idLibroVendido = idLibroVendido;
        this.precioVenta = precioVenta;
        this.fechaVenta = fechaVenta;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdLibroVendido() {
        return idLibroVendido;
    }

    public void setIdLibroVendido(int idLibroVendido) {
        this.idLibroVendido = idLibroVendido;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
}

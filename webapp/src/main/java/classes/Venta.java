package classes;

public interface Venta {
    int getIdTransaccion();

    void setIdTransaccion(int idTransaccion);

    int getIdComprador();

    void setIdComprador(int idComprador);

    int getIdVendedor();

    void setIdVendedor(int idVendedor);

    int getIdLibroVendido();

    void setIdLibroVendido(int idLibroVendido);

    double getPrecioVenta();

    void setPrecioVenta(double precioVenta);

    String getFechaVenta();

    void setFechaVenta(String fechaVenta);
}

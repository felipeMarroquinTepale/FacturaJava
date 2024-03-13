import java.util.Date;

public class OrdenCompra {
    private Integer identificador;
    private  String descripcion;
    private Date fecha;

    private Cliente cliente;
    private  Producto[] productos;

    private int indiceProductos;
    private static int ultimoId;

    public void addProducto(Producto producto) {
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }


    public int getGranTotal() {
        int total = 0;

        for (Producto p: productos){
            total += p.getPrecio();
        }

        return total;
    }

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++ultimoId;
        this.productos = new Producto[4];
    }


    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("Orden1");
        orden1.setCliente(new Cliente("Felipe","Marroquin"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Producto1OC1","Unida1",433));
        orden1.addProducto(new Producto("Producto2OC1","Unida2",4323));
        orden1.addProducto(new Producto("Producto3OC1","Unida3",4330));
        orden1.addProducto(new Producto("Producto4OC1","Unida4",4355));


        OrdenCompra orden2 = new OrdenCompra("Orden2");
        orden2.setCliente(new Cliente("Luis","Perez"));
        orden2.setFecha(new Date());

        orden2.addProducto(new Producto("Producto1OC2","Unida1",433));
        orden2.addProducto(new Producto("Producto2OC2","Unida2",4323));
        orden2.addProducto(new Producto("Producto3OC2","Unida3",4330));
        orden2.addProducto(new Producto("Producto4OC2","Unida4",4355));

        OrdenCompra orden3 = new OrdenCompra("Orden2");
        orden3.setCliente(new Cliente("uzi","Perez"));
        orden3.setFecha(new Date());

        orden3.addProducto(new Producto("Producto1OC3","Unida1",433));
        orden3.addProducto(new Producto("Producto2OC3","Unida2",4323));
        orden3.addProducto(new Producto("Producto3OC3","Unida3",4330));
        orden3.addProducto(new Producto("Producto4OC3","Unida4",4355));

        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden : ordenes) {
            System.out.println("Folio: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }




    }
}

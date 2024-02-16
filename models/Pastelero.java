package models;

public class Pastelero {
    private Inventario inventario;

    public Pastelero(Inventario inventario) {
        this.inventario = inventario;
    }

    public void registrarUsoInsumo(String nombre, int cantidadUtilizada) {
        Insumo insumo = inventario.obtenerInsumo(nombre);
        if (insumo != null) {
            int nuevaCantidad = insumo.getCantidad() - cantidadUtilizada;
            insumo.setCantidad(nuevaCantidad);
            System.out.println("Uso de " + cantidadUtilizada + " unidades de insumo '" + nombre + "' registrado.");
        } else {
            System.out.println("Insumo '" + nombre + "' no encontrado en el inventario.");
        }
    }
}

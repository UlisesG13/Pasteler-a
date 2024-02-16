package models;
public class Administrador {
    private Inventario inventario;

    public Administrador(Inventario inventario) {
        this.inventario = inventario;
    }

    public void agregarInsumo(String nombre, int cantidad) {
        inventario.agregarInsumo(nombre, cantidad);
    }

    public void actualizarInsumo(String nombre, int nuevaCantidad) {
        inventario.actualizarInsumo(nombre, nuevaCantidad);
    }
}

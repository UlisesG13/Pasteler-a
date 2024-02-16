package models;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private ArrayList<Insumo> inventario = new ArrayList<>();
    public Inventario() {
        this.inventario = new ArrayList<>();
    }

    public void agregarInsumo(String nombre, int cantidad) {
        Insumo insumo = new Insumo(nombre, cantidad);
        inventario.add(insumo);
        System.out.println("Insumo '" + nombre + "' agregado al inventario.");
    }

    public void actualizarInsumo(String nombre, int nuevaCantidad) {
        for (Insumo insumo : inventario) {
            if (insumo.getNombre().equals(nombre)) {
                insumo.setCantidad(nuevaCantidad);
                System.out.println("Stock de insumo '" + nombre + "' actualizado a " + nuevaCantidad + ".");
                return;
            }
        }
        System.out.println("Insumo '" + nombre + "' no encontrado en el inventario.");
    }

    public Insumo obtenerInsumo(String nombre) {
        for (Insumo insumo : inventario) {
            if (insumo.getNombre().equals(nombre)) {
                return insumo;
            }
        }
        return null;
    }
    public  ArrayList<Insumo> getListaInsumos(){
        return  inventario;
    }
}

import models.Administrador;
import models.Insumo;
import models.Inventario;
import models.Pastelero;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Administrador admin = new Administrador(inventario);
        Pastelero pastelero = new Pastelero(inventario);

        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("----------- Menú ------------");
            System.out.println("1. Agregar insumo (Administrador)");
            System.out.println("2. Actualizar stock de insumo (Administrador)");
            System.out.println("3. Registrar uso de insumo (Pastelero)");
            System.out.println("4. Mostrar stock de productos");
            System.out.println("5. Salir");
            System.out.println("----------------------------");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del insumo a agregar: ");
                    String nombreAgregar = scanner.next();
                    System.out.print("Ingrese la cantidad (en kilogramos) del insumo a agregar: ");
                    int cantidadAgregar = scanner.nextInt();
                    admin.agregarInsumo(nombreAgregar, cantidadAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del insumo a actualizar: ");
                    String nombreActualizar = scanner.next();
                    System.out.print("Ingrese la nueva cantidad (en kilogramos) del insumo: ");
                    int nuevaCantidad = scanner.nextInt();
                    admin.actualizarInsumo(nombreActualizar, nuevaCantidad);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del insumo usado: ");
                    String nombreUso = scanner.next();
                    System.out.print("Ingrese la cantidad (en kilogramos) de unidades utilizadas: ");
                    int cantidadUso = scanner.nextInt();
                    pastelero.registrarUsoInsumo(nombreUso, cantidadUso);
                    break;
                case 4:
                    if (!inventario.getListaInsumos().isEmpty()){
                        for (Insumo insumo:inventario.getListaInsumos()){
                            System.out.println(insumo.getNombre() + " : " + insumo.getCantidad() + "Kg");
                        }
                    } else  {
                        System.out.println("Lista de insumos vacia");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
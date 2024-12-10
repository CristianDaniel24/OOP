package Hasmap.Ejercicio1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static HashMap<Integer, Product> productos = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int idCounter = 1; //Asignar id automaticamente

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n----- Menu Products -----");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Buscar Producto");
            System.out.println("4. Editar Producto");
            System.out.println("5. Listar Productos");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 3:
                    buscarProducto();
                    break;
                case 4:
                    editarProducto();
                    break;
                case 5:
                    listarProductos();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    public static void agregarProducto() {
        System.out.print("\nIngrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        Product nuevoProducto = new Product(idCounter, nombre, precio);
        productos.put(idCounter, nuevoProducto);
        System.out.println("\nProducto agregado con exito: " + nuevoProducto);
        idCounter++;
    }

    public static void eliminarProducto() {
        System.out.print("\nIngrese el ID del producto para eliminar: ");
        int id = scanner.nextInt();

        if (productos.containsKey(id)) {
            productos.remove(id);
            System.out.println("Producto con ID " + id + " eliminado con exito");
        } else {
            System.out.println("\nProducto no encontrado o inexistente");
        }
    }

    public static void buscarProducto() {
        System.out.print("\nIngrese el ID del producto a buscar: ");
        int id = scanner.nextInt();

        if (productos.containsKey(id)) {
            Product producto = productos.get(id);
            System.out.println("Producto encontrado: " + producto);
        } else {
            System.out.println("\nProducto no encontrado o inexistente");
        }
    }

    public static void editarProducto() {
        System.out.print("Ingrese el ID del producto a editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (productos.containsKey(id)) {
            Product producto = productos.get(id);
            System.out.print("\nIngrese el nuevo nombre (actual: " + producto.getNombre() + "): ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Ingrese el nuevo precio (actual: " + producto.getPrecio() + "): ");
            double nuevoPrecio = scanner.nextDouble();

            producto.setNombre(nuevoNombre);
            producto.setPrecio(nuevoPrecio);
            System.out.println("\nProducto actualizado: " + producto);
        } else {
            System.out.println("\nProducto no encontrado");
        }
    }

    public static void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("\nNo existen productos");
        } else {
            for (Product producto : productos.values()) {
                System.out.println(producto);
            }
        }
    }
}
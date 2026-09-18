 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion;

        String[] categorias = {"Aseo", "Alimentos", "Tecnología"};

        do {
            System.out.println("=================================");
            System.out.println("      SISTEMA DE INVENTARIO");
            System.out.println("=================================");
            System.out.println("Categorías disponibles:");
            for (int i = 0; i < categorias.length; i++) {
                System.out.println("- " + categorias[i]);
            }
            System.out.println("---------------------------------");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número válido.");
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Código: ");
                    int codigo = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = Double.parseDouble(scanner.nextLine());
                    System.out.print("Cantidad: ");
                    int cantidad = Integer.parseInt(scanner.nextLine());

                        try {
        Producto nuevoProducto = new Producto(codigo, nombre, precio, cantidad);
        nuevoProducto.validarDatos();
        inventario.agregar(nuevoProducto);
        System.out.println("Producto registrado correctamente.");
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
                    break;

                case 2:
                    System.out.println("----- PRODUCTOS -----");
                    inventario.mostrarTodos();
                    break;

                case 3:
                    System.out.print("Ingrese el código: ");
                    int codigoBuscar = Integer.parseInt(scanner.nextLine());
                    try {
                        Producto encontrado = inventario.buscarPorCodigo(codigoBuscar);
                        encontrado.mostrarInformacion();
                    } catch (ProductoNoEncontradoException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
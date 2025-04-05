import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        ListaPedidos listasimple = new ListaPedidos();
        ListaDoblePedidos listaDoble = new ListaDoblePedidos();
        ListaCircularPedido listaCirculars = new ListaCircularPedido();

        System.out.println("Bienvenido al sistema de inventario");
        System.out.println("Productos disponibles:");
        inventario.mostrarInventario();

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar pedido");
            System.out.println("2. Mostrar pedido en lista simple");
            System.out.println("3. Mostrar pedido en lista circular");
            System.out.println("4. Mostrar pedido en lista doble adelante");
            System.out.println("5. Mostrar pedido en lista doble atrás");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 6) {
                System.out.println("Gracias por usar el sistema de inventario");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = scanner.nextInt();

                    int indiceProducto = inventario.mostrarProducto(producto);
                    if (indiceProducto == -1) {
                        System.out.println("¡Producto no encontrado!");
                    } else {
                        if (inventario.verificarStock(indiceProducto, cantidad)) {
                            inventario.actualizarStock(indiceProducto, cantidad);
                            listasimple.agregarPedido(producto, cantidad);
                            listaDoble.agregarPedido(producto, cantidad);
                            listaCirculars.agregarPedido(producto, cantidad);
                            System.out.println("Pedido agregado correctamente.");
                        } else {
                            System.out.println("No hay suficiente stock.");
                        }
                    }
                    break;

                case 2:
                    listasimple.mostrarPedido();
                    break;

                case 3:
                    listaCirculars.mostrarPedidosCirculares();
                    break;

                case 4:
                    listaDoble.mostrarPedidoAdelante();
                    break;

                case 5:
                    listaDoble.mostrarPedidoAtras();
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }
}
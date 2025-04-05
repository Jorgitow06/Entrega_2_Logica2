public class ListaDoblePedidos {
    private Pedido cabeza;
    private Pedido cola;

    public void agregarPedido(String producto, int cantidad) {
        Pedido nuevo = new Pedido(producto, cantidad);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void mostrarPedidoAdelante() {
        Pedido temp = cabeza;
        while (temp != null) {
            System.out.println("Pedido Doble: " + temp.producto + " cantidad: " + temp.cantidad);
            temp = temp.siguiente;
        }
    }

    public void mostrarPedidoAtras() {
        Pedido temp = cola;
        while (temp != null) {
            System.out.println("Pedido Doble: " + temp.producto + " cantidad: " + temp.cantidad);
            temp = temp.anterior;
        }
    }
}

// Clase auxiliar Pedido
class Pedido {
    String producto;
    int cantidad;
    Pedido siguiente;
    Pedido anterior;

    public Pedido(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.siguiente = null;
        this.anterior = null;
    }
}

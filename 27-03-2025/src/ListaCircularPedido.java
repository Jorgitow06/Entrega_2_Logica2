public class ListaCircularPedido {
    private Pedido ultimo;

    public void agregarPedido(String producto, int cantidad) {
        Pedido nuevo = new Pedido(producto, cantidad);

        if (ultimo == null) {
            ultimo = nuevo;
            ultimo.siguiente = ultimo;
        } else {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public void mostrarPedidosCirculares() {
        if (ultimo == null) {
            System.out.println("No hay pedidos en la lista circular");
            return;
        }

        Pedido temp = ultimo.siguiente;
        do {
            System.out.println("Pedido circular: " + temp.producto + " " + temp.cantidad);
            temp = temp.siguiente;
        } while (temp != ultimo.siguiente);
    }
}

class Pedido {
    String producto;
    int cantidad;
    Pedido siguiente;

    public Pedido(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.siguiente = null;
    }
}

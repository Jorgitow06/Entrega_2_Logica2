public class pedido {

    String producto;
    int cantidad;
    pedido siguiente;
    pedido anterior;

    public pedido(String producto, int cantidad, pedido siguiente, pedido anterior) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
}

public class Inventario {
    private String[] productos = {"laptop", "mouse", "teclado", "monitor", "impresora"};
    private double[][] stockPrecio = {
        {10, 50000},
        {15, 80000},
        {12, 200000},
        {2, 150000},
        {5, 300000}
    };

    public void mostrarInventario() {
        System.out.println("Inventario de productos");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i] + " Stock: " + stockPrecio[i][0] + " Precio: " + stockPrecio[i][1]);
        }
    }

    public int mostrarProducto(String nombre) {
        for (int index = 0; index < productos.length; index++) {
            if (productos[index].equals(nombre)) {
                return index;
            }
        }
        return -1;
    }

    public boolean verificarStock(int indice, int cantidad) {
        if (indice >= 0 && indice < stockPrecio.length) { // Verifica que el índice sea válido
            return stockPrecio[indice][0] >= cantidad;
        }
        return false;
    }

    public void actualizarStock(int indice, int cantidad) {
        if (indice >= 0 && indice < stockPrecio.length) { // Verifica que el índice sea válido
            stockPrecio[indice][0] -= cantidad;
        }
    }
}


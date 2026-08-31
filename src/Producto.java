public class Producto {

    private static final int STOCK_MINIMO = 5;

    private String nombreProducto;
    private double precioProducto;
    private int cantidadDisponible;

    public Producto(String nombreProducto, double precioProducto, int cantidadDisponible) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadDisponible = cantidadDisponible;
    }

    public boolean tieneStock(int cantidadSolicitada) {
        return cantidadDisponible >= cantidadSolicitada;
    }

    public double calcularValorInventario() {
        return precioProducto * cantidadDisponible;
    }

    public boolean tieneStockBajo() {
        return cantidadDisponible <= STOCK_MINIMO;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio: $" + precioProducto);
        System.out.println("Stock disponible: " + cantidadDisponible);
    }

    public static void main(String[] args) {

        Producto arroz = new Producto("Arroz 1 kg", 4500, 18);

        arroz.mostrarInformacion();

        int cantidadSolicitada = 2;

        if (arroz.tieneStock(cantidadSolicitada)) {
            System.out.println("El producto tiene disponibilidad para el pedido.");
        } else {
            System.out.println("No hay suficiente producto disponible.");
        }

        System.out.println(
            "Valor del inventario: $" + arroz.calcularValorInventario()
        );
    }
}
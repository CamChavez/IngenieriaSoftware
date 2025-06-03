// Main
public class MainStrategy {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        carrito.setMetodoPago(new PagoPaypal());
        carrito.pagar(150.0);
    }
}
// Estrategia
interface MetodoPago {
    void pagar(double cantidad);
}

// Estrategias concretas
class PagoTarjeta implements MetodoPago {
    public void pagar(double cantidad) {
        System.out.println("Pagando " + cantidad + " con tarjeta.");
    }
}

class PagoPaypal implements MetodoPago {
    public void pagar(double cantidad) {
        System.out.println("Pagando " + cantidad + " con PayPal.");
    }
}

class PagoEfectivo implements MetodoPago {
    public void pagar(double cantidad) {
        System.out.println("Pagando " + cantidad + " en efectivo.");
    }
}

// Contexto
class Carrito {
    private MetodoPago metodo;

    public void setMetodoPago(MetodoPago metodo) {
        this.metodo = metodo;
    }

    public void pagar(double cantidad) {
        metodo.pagar(cantidad);
    }
}

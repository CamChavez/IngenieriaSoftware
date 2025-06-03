// Main
public class MainBuilder {
    public static void main(String[] args) {
        BuilderComputadora builder = new PCGamerBuilder();
        Tienda tienda = new Tienda();
        tienda.construirComputadora(builder);
        Computadora pc = builder.obtenerComputadora();
        pc.mostrar();
    }
}
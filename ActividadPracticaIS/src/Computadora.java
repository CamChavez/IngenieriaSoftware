// Producto
class Computadora {
    private String cpu;
    private String ram;
    private String gpu;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void mostrar() {
        System.out.println("PC con: " + cpu + ", " + ram + ", " + gpu);
    }
}

// Builder abstracto
abstract class BuilderComputadora {
    protected Computadora pc = new Computadora();
    public abstract void construirCPU();
    public abstract void construirRAM();
    public abstract void construirGPU();
    public Computadora obtenerComputadora() {
        return pc;
    }
}

// Builder concreto
class PCGamerBuilder extends BuilderComputadora {
    public void construirCPU() {
        pc.setCpu("Intel i9");
    }
    public void construirRAM() {
        pc.setRam("32GB");
    }
    public void construirGPU() {
        pc.setGpu("NVIDIA RTX 4090");
    }
}

// Director
class Tienda {
    public void construirComputadora(BuilderComputadora builder) {
        builder.construirCPU();
        builder.construirRAM();
        builder.construirGPU();
    }
}

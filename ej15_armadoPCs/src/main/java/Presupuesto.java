public abstract class Presupuesto {
    protected Catalogo catalogo;
    protected Computadora computadora;

    public Presupuesto() {
        this.computadora = new Computadora();
        this.catalogo = new Catalogo();
    }

    public abstract void armarProcesador();
    public abstract void armarRAM();
    public abstract void armarDisco();
    public abstract void armarGPU();
    public abstract void armarGabinete();
    public abstract void armarFuente();
    public abstract void armarExtras();

    public Computadora getComputadora() { return this.computadora; }
}

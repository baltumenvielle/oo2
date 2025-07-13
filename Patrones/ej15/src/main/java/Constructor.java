public abstract class Constructor {
    protected Catalogo catalogo;
    protected Equipo equipo;

    public void reset() { this.equipo = new Equipo(); }
    public Equipo getEquipo() { return this.equipo; }

    protected abstract void armarCPU();
    protected abstract void armarRAM();
    protected abstract void armarDisco();
    protected abstract void armarGPU();
    protected abstract void armarGabinete();
    protected abstract void armarFuente();
}

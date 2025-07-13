public class Basico extends Constructor {
    @Override
    protected void armarCPU() {
        this.equipo.setComponente(this.catalogo.getComponente("Procesador Basico"));
    }

    @Override
    protected void armarRAM() {
        this.equipo.setComponente(this.catalogo.getComponente("8 GB"));
    }

    @Override
    protected void armarDisco() {
        this.equipo.setComponente(this.catalogo.getComponente("HDD 500 GB"));
    }

    @Override
    protected void armarGPU() {}

    @Override
    protected void armarGabinete() {
        this.equipo.setComponente(this.catalogo.getComponente("Gabinete estandar"));
    }

    @Override
    protected void armarFuente() {}
}

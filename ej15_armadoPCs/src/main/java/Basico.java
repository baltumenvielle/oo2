public class Basico extends Presupuesto {

    @Override
    public void armarProcesador() { this.computadora.setComponente(this.catalogo.getComponente("Procesador Básico")); }

    @Override
    public void armarRAM() { this.computadora.setComponente(this.catalogo.getComponente("8 GB")); }

    @Override
    public void armarDisco() { this.computadora.setComponente(this.catalogo.getComponente("HDD 500 GB")); }

    @Override
    public void armarGPU() {}

    @Override
    public void armarGabinete() { this.computadora.setComponente(this.catalogo.getComponente("Gabinete Estándar")); }

    @Override
    public void armarFuente() {}

    @Override
    public void armarExtras() {}
}

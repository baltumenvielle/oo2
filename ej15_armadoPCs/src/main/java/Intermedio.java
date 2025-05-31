public class Intermedio extends Presupuesto {

    @Override
    public void armarProcesador() { this.computadora.setComponente(this.catalogo.getComponente("Procesador Intermedio")); }

    @Override
    public void armarRAM() { this.computadora.setComponente(this.catalogo.getComponente("16 GB")); }

    @Override
    public void armarDisco() { this.computadora.setComponente(this.catalogo.getComponente("SSD 500 GB")); }

    @Override
    public void armarGPU() { this.computadora.setComponente(this.catalogo.getComponente("GTX 1650")); }

    @Override
    public void armarGabinete() { this.computadora.setComponente(this.catalogo.getComponente("Gabinete Intermedio")); }

    @Override
    public void armarFuente() { this.computadora.setComponente(this.catalogo.getComponente("Fuente 800 w")); }

    @Override
    public void armarExtras() {}
}

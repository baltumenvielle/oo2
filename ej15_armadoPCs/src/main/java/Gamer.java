public class Gamer extends Presupuesto {

    @Override
    public void armarProcesador() { this.computadora.setComponente(this.catalogo.getComponente("Procesador Gamer")); }

    @Override
    public void armarRAM() {
        this.computadora.setComponente(this.catalogo.getComponente("32 GB"));
        this.computadora.setComponente(this.catalogo.getComponente("32 GB"));
    }

    @Override
    public void armarDisco() {
        this.computadora.setComponente(this.catalogo.getComponente("SSD 500 GB"));
        this.computadora.setComponente(this.catalogo.getComponente("SSD 1 TB"));
    }

    @Override
    public void armarGPU() { this.computadora.setComponente(this.catalogo.getComponente("RTX 4090")); }

    @Override
    public void armarGabinete() { this.computadora.setComponente(this.catalogo.getComponente("Gabinete Gamer")); }

    @Override
    public void armarFuente() {
        this.computadora.setComponente(this.catalogo
                        .getComponente("Fuente "
                                + String.valueOf(this.computadora.getConsumo() * 1.5)
                                + " w"));
    }

    @Override
    public void armarExtras() {
        this.computadora.setComponente(this.catalogo.getComponente("Pad térmico"));
        this.computadora.setComponente(this.catalogo.getComponente("Cooler"));
    }
}

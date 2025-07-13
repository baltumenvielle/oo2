public class Gamer extends Constructor {
    @Override
    protected void armarCPU() {
        this.equipo.setComponente(this.catalogo.getComponente("Procesador Gamer"));
    }

    @Override
    protected void armarRAM() {
        this.equipo.setComponente(this.catalogo.getComponente("32 gb"));
        this.equipo.setComponente(this.catalogo.getComponente("32 gb"));
    }

    @Override
    protected void armarDisco() {
        this.equipo.setComponente(this.catalogo.getComponente("SSD 500gb"));
        this.equipo.setComponente(this.catalogo.getComponente("SSD 1 TB"));
    }

    @Override
    protected void armarGPU() {
        this.equipo.setComponente(this.catalogo.getComponente("RTX 4090"));
    }

    @Override
    protected void armarGabinete() {
        this.equipo.setComponente(this.catalogo.getComponente("Gabinete Gamer"));
    }

    @Override
    protected void armarFuente() {
        this.equipo.setComponente(this.catalogo.getComponente("fuente " + this.equipo.calcularConsumo() * 1.5 + " w"));
    }
}

public abstract class Bien {
    public abstract double calcularLiquidez();
    public abstract double calcularValor();
    double calcularValorPrendario() { return this.calcularLiquidez() * this.calcularValor(); }
    public abstract void agregarBien(Bien bien);
}

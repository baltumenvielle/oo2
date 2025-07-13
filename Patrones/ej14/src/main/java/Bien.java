public abstract class Bien {
    public double calcularValorPrendario() { return this.calcularValor() * this.calcularLiquidez(); }
    protected abstract double calcularValor();
    protected abstract double calcularLiquidez();
}

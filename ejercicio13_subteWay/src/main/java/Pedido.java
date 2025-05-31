public abstract class Pedido {
    protected Sandwich sandwich;

    public Pedido() {
        sandwich = new Sandwich();
    }

    public abstract void construirPan();
    public abstract void construirAderezo();
    public abstract void construirRelleno();
    public abstract void construirAdicional();

    public Sandwich getSandwich() { return this.sandwich; }
}

public abstract class Constructor {
    protected Sandwich sandwich;

    public void reset() { this.sandwich = new Sandwich(); }

    public abstract void armarPan();
    public abstract void armarAderezo();
    public abstract void armarRelleno();
    public abstract void armarAdicional();
}

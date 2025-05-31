public class SubteWay {
    private Pedido pedido;

    public Sandwich hacerSandwich(Pedido pedido) {
        this.pedido = pedido;
        this.pedido.construirPan();
        this.pedido.construirAderezo();
        this.pedido.construirRelleno();
        this.pedido.construirAdicional();
        return this.pedido.getSandwich();
    }
}

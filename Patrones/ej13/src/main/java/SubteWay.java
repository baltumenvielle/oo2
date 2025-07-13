public class SubteWay {
    private Constructor constructor;

    public void armarSandwich() {
        this.constructor.reset();
        this.constructor.armarPan();
        this.constructor.armarAderezo();
        this.constructor.armarRelleno();
        this.constructor.armarAdicional();
    }
}

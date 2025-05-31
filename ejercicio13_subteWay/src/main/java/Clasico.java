public class Clasico extends Pedido {

    @Override
    public void construirPan() {
        this.sandwich.setPan("Pan brioche");
        this.sandwich.setPrecioPan(100);
    }

    @Override
    public void construirAderezo() {
        this.sandwich.setAderezo("Mayonesa");
        this.sandwich.setPrecioAderezo(20);
    }

    @Override
    public void construirRelleno() {
        this.sandwich.setRelleno("Carne de ternera");
        this.sandwich.setPrecioRelleno(300);
    }

    @Override
    public void construirAdicional() {
        this.sandwich.setAdicional("Tomate");
        this.sandwich.setPrecioAdicional(80);
    }
}

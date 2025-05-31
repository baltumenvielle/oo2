public class Vegano extends Pedido {

    @Override
    public void construirPan() {
        this.sandwich.setPan("Pan integral");
        this.sandwich.setPrecioPan(100);
    }

    @Override
    public void construirAderezo() {
        this.sandwich.setAderezo("Salsa criolla");
        this.sandwich.setPrecioAderezo(20);
    }

    @Override
    public void construirRelleno() {
        this.sandwich.setRelleno("Milanesa de girgolas");
        this.sandwich.setPrecioRelleno(500);
    }

    @Override
    public void construirAdicional() {
        this.sandwich.setAdicional(null);
        this.sandwich.setPrecioAdicional(0);
    }
}
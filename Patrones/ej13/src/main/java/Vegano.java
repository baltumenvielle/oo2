public class Vegano extends Constructor {
    @Override
    public void armarPan() {
        this.sandwich.setPan("Pan integral");
        this.sandwich.setPrecioPan(100);
    }

    @Override
    public void armarAderezo() {
        this.sandwich.setAderezo("Salsa criolla");
        this.sandwich.setPrecioAderezo(20);
    }

    @Override
    public void armarRelleno() {
        this.sandwich.setRelleno("Milanesa de girgolas");
        this.sandwich.setPrecioRelleno(500);
    }

    @Override
    public void armarAdicional() {
        this.sandwich.setAdicional("");
        this.sandwich.setPrecioAdicional(0);
    }
}

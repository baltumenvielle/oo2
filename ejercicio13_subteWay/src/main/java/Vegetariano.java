public class Vegetariano extends Pedido {

    @Override
    public void construirPan() {
        this.sandwich.setPan("Pan con semillas");
        this.sandwich.setPrecioPan(120);
    }

    @Override
    public void construirAderezo() {
        this.sandwich.setAderezo(null);
        this.sandwich.setPrecioAderezo(0);
    }

    @Override
    public void construirRelleno() {
        this.sandwich.setRelleno("Provoleta grillada");
        this.sandwich.setPrecioRelleno(200);
    }

    @Override
    public void construirAdicional() {
        this.sandwich.setAdicional("Berenjenas al escabeche");
        this.sandwich.setPrecioAdicional(100);
    }
}

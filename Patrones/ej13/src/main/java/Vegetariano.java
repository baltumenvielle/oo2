public class Vegetariano extends Constructor {
    @Override
    public void armarPan() {
        this.sandwich.setPan("Pan con semillas");
        this.sandwich.setPrecioPan(120);
    }

    @Override
    public void armarAderezo() {
        this.sandwich.setAderezo("");
        this.sandwich.setPrecioAderezo(0);
    }

    @Override
    public void armarRelleno() {
        this.sandwich.setRelleno("Provoleta grillada");
        this.sandwich.setPrecioRelleno(200);
    }

    @Override
    public void armarAdicional() {
        this.sandwich.setAdicional("Berenjenas al escabeche");
        this.sandwich.setPrecioAdicional(100);
    }
}

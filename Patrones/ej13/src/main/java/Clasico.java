public class Clasico extends Constructor {
    @Override
    public void armarPan() {
        this.sandwich.setPan("Brioche");
        this.sandwich.setPrecioPan(100);
    }

    @Override
    public void armarAderezo() {
        this.sandwich.setAderezo("Mayonesa");
        this.sandwich.setPrecioAderezo(20);
    }

    @Override
    public void armarRelleno() {
        this.sandwich.setRelleno("Carne de ternera");
        this.sandwich.setPrecioRelleno(300);
    }

    @Override
    public void armarAdicional() {
        this.sandwich.setAdicional("Tomate");
        this.sandwich.setPrecioAdicional(80);
    }
}

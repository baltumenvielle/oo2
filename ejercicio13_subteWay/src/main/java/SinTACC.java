public class SinTACC extends Pedido {

    @Override
    public void construirPan() {
        this.sandwich.setPan("Pan de chipá");
        this.sandwich.setPrecioPan(150);
    }

    @Override
    public void construirAderezo() {
        this.sandwich.setAderezo("Salsa tártara");
        this.sandwich.setPrecioAderezo(18);
    }

    @Override
    public void construirRelleno() {
        this.sandwich.setRelleno("Carne de pollo");
        this.sandwich.setPrecioRelleno(250);
    }

    @Override
    public void construirAdicional() {
        this.sandwich.setAdicional("Verduras grilladas");
        this.sandwich.setPrecioAdicional(200);
    }
}
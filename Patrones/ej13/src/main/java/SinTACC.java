public class SinTACC extends Constructor {
    @Override
    public void armarPan() {
        this.sandwich.setPan("Pan de chipa");
        this.sandwich.setPrecioPan(150);
    }

    @Override
    public void armarAderezo() {
        this.sandwich.setAderezo("Salsa tartara");
        this.sandwich.setPrecioAderezo(18);
    }

    @Override
    public void armarRelleno() {
        this.sandwich.setRelleno("Carne de pollo");
        this.sandwich.setPrecioRelleno(250);
    }

    @Override
    public void armarAdicional() {
        this.sandwich.setAdicional("Verduras grilladas");
        this.sandwich.setPrecioAdicional(200);
    }
}

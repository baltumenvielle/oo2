public class Sandwich {
    private String pan, aderezo, relleno, adicional;
    private double precioPan, precioAderezo, precioRelleno, precioAdicional;

    public double getPrecioPan() { return this.precioPan; }

    public double getPrecioAderezo() { return this.precioAderezo; }

    public double getPrecioRelleno() { return this.precioRelleno; }

    public double getPrecioAdicional() { return this.precioAdicional; }

    public void setAdicional(String adicional) { this.adicional = adicional; }

    public void setRelleno(String relleno) { this.relleno = relleno; }

    public void setAderezo(String aderezo) { this.aderezo = aderezo; }

    public void setPrecioPan(double precioPan) { this.precioPan = precioPan; }

    public void setPrecioAderezo(double precioAderezo) { this.precioAderezo = precioAderezo; }

    public void setPrecioRelleno(double precioRelleno) { this.precioRelleno = precioRelleno; }

    public void setPrecioAdicional(double precioAdicional) { this.precioAdicional = precioAdicional; }

    public void setPan(String pan) { this.pan = pan; }

    public double calcularPrecio() {
        return this.getPrecioPan() +
                this.getPrecioAderezo() +
                this.getPrecioRelleno() +
                this.getPrecioAdicional();
    }
}

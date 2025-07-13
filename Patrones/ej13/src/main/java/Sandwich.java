public class Sandwich {
    private String pan, aderezo, relleno, adicional;
    private double precioPan, precioRelleno, precioAderezo, precioAdicional;

    public double calcularPrecio() { return this.precioPan + this.precioRelleno + this.precioAderezo + this.precioAdicional; }

    public void setAderezo(String aderezo) { this.aderezo = aderezo; }
    public void setPrecioAderezo(double precio) { this.precioAderezo = precio; }
    public void setAdicional(String adicional) { this.adicional = adicional; }
    public void setPrecioAdicional(double precio) { this.precioAdicional = precio; }
    public void setPan(String pan) { this.pan = pan; }
    public void setPrecioPan(double precio) { this.precioPan = precio; }
    public void setRelleno(String relleno) { this.relleno = relleno; }
    public void setPrecioRelleno(double precio) { this.precioRelleno = precio; }
}

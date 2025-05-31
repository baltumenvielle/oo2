public class Calculadora {
    private double valorAcumulado;
    private Estado estado;

    public Calculadora() {
        this.valorAcumulado = 0;
        this.estado = new Esperando();
    }

    public double getValorAcumulado() { return this.valorAcumulado; }
    public void setValorAcumulado(double valorAcumulado) { this.valorAcumulado = valorAcumulado; }

    public void setEstado(Estado estado) { this.estado = estado; }

    public String getResultado() { return this.estado.getResultado(this); }
    public void setValor(double unValor) { this.estado.setValor(unValor, this); }
    public void mas() { this.estado.mas(this); }
    public void menos() { this.estado.menos(this); }
    public void por() { this.estado.por(this); }
    public void dividido() { this.estado.dividido(this); }

    public void borrar() {
        this.valorAcumulado = 0;
        this.estado = new Esperando();
    }
}

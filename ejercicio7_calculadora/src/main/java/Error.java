public class Error implements Estado {

    @Override
    public String getResultado(Calculadora calculadora) {
        return "Error";
    }

    @Override
    public void setValor(double unValor, Calculadora calculadora) {}

    @Override
    public void mas(Calculadora calculadora) {}

    @Override
    public void menos(Calculadora calculadora) {}

    @Override
    public void por(Calculadora calculadora) {}

    @Override
    public void dividido(Calculadora calculadora) {}
}

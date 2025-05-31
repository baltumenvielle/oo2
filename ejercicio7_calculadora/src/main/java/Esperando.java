public class Esperando implements Estado {

    @Override
    public String getResultado(Calculadora calculadora) {
        return String.valueOf(calculadora.getValorAcumulado());
    }

    @Override
    public void setValor(double unValor, Calculadora calculadora) {
        calculadora.setValorAcumulado(unValor);
    }

    @Override
    public void mas(Calculadora calculadora) {
        calculadora.setEstado(new Sumando());
    }

    @Override
    public void menos(Calculadora calculadora) {
        calculadora.setEstado(new Restando());
    }

    @Override
    public void por(Calculadora calculadora) {
        calculadora.setEstado(new Multiplicando());
    }

    @Override
    public void dividido(Calculadora calculadora) {
        calculadora.setEstado(new Dividiendo());
    }
}

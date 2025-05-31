public abstract class Operando implements Estado {

    @Override
    public String getResultado(Calculadora calculadora) {
        calculadora.setEstado(new Error());
        return "Error";
    }

    @Override
    public void mas(Calculadora calculadora) {
        calculadora.setEstado(new Error());
    }

    @Override
    public void menos(Calculadora calculadora) {
        calculadora.setEstado(new Error());
    }

    @Override
    public void por(Calculadora calculadora) {
        calculadora.setEstado(new Error());
    }

    @Override
    public void dividido(Calculadora calculadora) {
        calculadora.setEstado(new Error());
    }

    @Override
    public abstract void setValor(double unValor, Calculadora calculadora);
}

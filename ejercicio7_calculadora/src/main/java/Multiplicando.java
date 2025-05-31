public class Multiplicando extends Operando {

    @Override
    public void setValor(double unValor, Calculadora calculadora) {
        calculadora.setValorAcumulado(calculadora.getValorAcumulado() * unValor);
        calculadora.setEstado(new Esperando());
    }
}

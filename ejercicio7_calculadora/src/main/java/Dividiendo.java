public class Dividiendo extends Operando {

    @Override
    public void setValor(double unValor, Calculadora calculadora) {
        if (unValor == 0) calculadora.setEstado(new Error());
        else {
            calculadora.setValorAcumulado(calculadora.getValorAcumulado() / unValor);
            calculadora.setEstado(new Esperando());
        }
    }
}

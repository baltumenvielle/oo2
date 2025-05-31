public interface Estado {
    String getResultado(Calculadora calculadora);
    void setValor(double unValor, Calculadora calculadora);
    void mas(Calculadora calculadora);
    void menos(Calculadora calculadora);
    void por(Calculadora calculadora);
    void dividido(Calculadora calculadora);
}

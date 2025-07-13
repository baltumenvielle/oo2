public class Hierro implements Armadura {
    @Override
    public double recibirDano(Arma arma) { return arma.contraHierro(); }
}

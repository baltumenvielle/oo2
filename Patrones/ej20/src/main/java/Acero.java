public class Acero implements Armadura {
    @Override
    public double recibirDano(Arma arma) { return arma.contraAcero(); }
}

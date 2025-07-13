public class Cuero implements Armadura {
    @Override
    public double recibirDano(Arma arma) { return arma.contraCuero(); }
}

public class Acero implements Armadura {
    @Override
    public int recibirDanio(Arma arma) { return arma.getDanioAcero(); }
}

package ar.info.juego.Encriptador;

public class FeistelAdapter implements Cifrado {
    private FeistelCipher adaptee;
    @Override
    public void encriptar(String mensaje) { adaptee.encode(mensaje); }
    @Override
    public void desencriptar(String mensaje) { adaptee.encode(mensaje); }
}

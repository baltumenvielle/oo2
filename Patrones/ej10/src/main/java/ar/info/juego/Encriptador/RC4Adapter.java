package ar.info.juego.Encriptador;

public class RC4Adapter implements Cifrado {
    private RC4 adaptee;
    private String key;

    @Override
    public void encriptar(String mensaje) { this.adaptee.encriptar(mensaje, key); }
    @Override
    public void desencriptar(String mensaje) { this.adaptee.desencriptar(mensaje, key); }
}

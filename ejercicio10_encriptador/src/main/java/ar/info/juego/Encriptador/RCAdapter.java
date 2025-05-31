package ar.info.juego.Encriptador;

public class RCAdapter implements Cifrado {
    private RC4 rc4;
    private String key;

    @Override
    public void encriptar(String mensaje) {
        this.rc4 = new RC4();
        this.rc4.encriptar(mensaje, this.key);
    }

    @Override
    public void desencriptar(String mensaje) {
        this.rc4.desencriptar(mensaje, this.key);
    }
}

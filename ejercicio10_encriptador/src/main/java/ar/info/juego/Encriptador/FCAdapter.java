package ar.info.juego.Encriptador;

public class FCAdapter implements Cifrado {
    private FeistelCipher feistelCipher;

    @Override
    public void encriptar(String mensaje) {
        this.feistelCipher = new FeistelCipher(mensaje);
        this.feistelCipher.encode(mensaje);
    }

    @Override
    public void desencriptar(String mensaje) {
        this.feistelCipher.encode(mensaje);
    }
}

package ar.info.juego.Encriptador;

public class Mensajero {
    private Cifrado cifrado;

    public void cambiarCifrado(Cifrado cifrado) { this.cifrado = cifrado; }
    public void enviar(String mensaje) { this.cifrado.encriptar(mensaje); }
    public void recibir(String mensaje) { this.cifrado.desencriptar(mensaje); }
}

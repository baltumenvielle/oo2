package ar.edu.unlp.info.oo1.ejercicio2_piedraPapelTijera;

import java.util.Random;

public class Jugador {
	private Jugador contrincante;
	private Random random;
	
	public Eleccion elegir() {
		int eleccion = random.nextInt(3); // Genera un número entre 0 y 2

        switch (eleccion) {
            case 0:
                return new Piedra();
            case 1:
                return new Papel();
            case 2:
                return new Tijera();
            default:
                throw new IllegalStateException("Elección inválida");
        }
	}
        
    public String jugar() {
    	return this.elegir().jugarContra(contrincante.elegir());
    }
}

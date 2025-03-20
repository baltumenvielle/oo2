package ar.edu.unlp.info.oo1.ejercicio2_piedraPapelTijera;

public class Piedra implements Eleccion {
	
	@Override
	public String getTipo() {
		return "Piedra";
	}

	@Override
	public String jugarContra(Eleccion eleccion) {
		if (eleccion.getTipo() == "Piedra") {
			return "Empate"; 
		}
		else if (eleccion.getTipo() == "Papel") {
			return "Derrota"; 
		}
		else return "Victoria";
	}
}

package ar.edu.unlp.info.oo1.ejercicio2_piedraPapelTijera;

public class Tijera implements Eleccion {

	@Override
	public String jugarContra(Eleccion eleccion) {
		if (eleccion.getTipo() == "Piedra") {
			return "Derrota"; 
		}
		else if (eleccion.getTipo() == "Papel") {
			return "Victoria"; 
		}
		else return "Empate";
	}

	@Override
	public String getTipo() {
		return "Tijera";
	}


}

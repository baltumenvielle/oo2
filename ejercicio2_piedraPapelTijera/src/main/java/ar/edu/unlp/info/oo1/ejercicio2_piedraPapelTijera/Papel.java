package ar.edu.unlp.info.oo1.ejercicio2_piedraPapelTijera;

public class Papel implements Eleccion {

	@Override
	public String jugarContra(Eleccion eleccion) {
		if (eleccion.getTipo() == "Piedra") {
			return "Victoria"; 
		}
		else if (eleccion.getTipo() == "Papel") {
			return "Empate"; 
		}
		else return "Derrota";
	}

	@Override
	public String getTipo() {
		return "Papel";
	}
	

}

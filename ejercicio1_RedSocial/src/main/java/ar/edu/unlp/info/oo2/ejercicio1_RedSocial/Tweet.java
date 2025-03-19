package ar.edu.unlp.info.oo2.ejercicio1_RedSocial;

public class Tweet implements Publicacion {
	private String mensaje;

	@Override
	public boolean esRetweet() {
		return false;
	}
}

package ar.edu.unlp.info.oo2.ejercicio1_RedSocial;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private List<Publicacion> publicaciones;
	private String screenName;
	
	public Usuario(String screenName) {
		publicaciones = new LinkedList<Publicacion>();
		this.screenName = screenName;
	}
	
	public void tweetear(String mensaje) {
		if (mensaje.length() > 1 && mensaje.length() <= 280) {
			publicaciones.add(new Tweet(mensaje));
		}
	}
	
	public void retweetear(Tweet tweet) {
		publicaciones.add(new Retweet(tweet));
	}
}

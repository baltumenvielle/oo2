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
	
	public void tweetear(Tweet tweet) {
		publicaciones.add(tweet);
	}
	
	public void retweetear(Tweet tweet) {
		Retweet retweet = new Retweet(tweet);
		publicaciones.add(retweet);
	}
	
	public void eliminarPublicaciones() {
		publicaciones.removeAll(publicaciones);
	}
	
	public boolean contieneTweet(Tweet tweet) {
		return publicaciones.stream()
				.filter(publicacion -> publicacion.esRetweet())
				.anyMatch(retweet -> retweet.contieneTweet(tweet));
	}
}

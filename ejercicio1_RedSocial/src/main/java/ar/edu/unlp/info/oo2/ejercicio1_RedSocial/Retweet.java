package ar.edu.unlp.info.oo2.ejercicio1_RedSocial;

public class Retweet implements Publicacion {
	private Tweet tweet;
	
	public Retweet(Tweet tweet) {
		this.tweet = tweet;
	}
}

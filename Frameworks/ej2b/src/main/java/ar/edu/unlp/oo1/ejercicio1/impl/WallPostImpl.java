package ar.edu.unlp.oo1.ejercicio1.impl;

import java.io.IOException;
import java.util.logging.*;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean isFeatured;

	private static final Logger modelLogger = Logger.getLogger("wallpost.model");
	private static final Logger UILogger = Logger.getLogger("wallpost.UI");
	private static final Logger mailLogger = Logger.getLogger("wallpost.extras");


	static {
        try {
            modelLogger.addHandler(new FileHandler("likes.txt"));
			modelLogger.setLevel(Level.INFO);

			UILogger.addHandler(new ConsoleHandler());
			UILogger.setLevel(Level.INFO);

			MailHandler mailHandler = new MailHandler();
			mailHandler.setFormatter(new SimpleFormatter());
			mailLogger.addHandler(mailHandler);
			mailLogger.setLevel(Level.INFO);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

	public WallPostImpl() {
		this.text = "Undefined post";
		UILogger.log(Level.INFO, "Aplicación iniciada");
		mailLogger.log(Level.INFO, "Enviado desde java.util.logging");
	}

	public WallPostImpl(String text, int likes, boolean isFeaured) {
		this.text = text;
		this.likes = likes;
		this.isFeatured = isFeaured;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
		UILogger.log(Level.INFO, "Nombre escrito correctamente");
	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		this.likes = this.likes + 1;
		UILogger.log(Level.INFO, "Like aplicado");
		if (this.likes == 10) modelLogger.log(Level.WARNING, "10 likes");
	}

	@Override
	public void dislike() {
		if (likes > 0) {
			this.likes = this.likes - 1;
		}
		UILogger.log(Level.INFO, "Dislike aplicado");
		if (this.likes == 0) modelLogger.log(Level.WARNING, "0 likes");
	}

	@Override
	public boolean isFeatured() {
		return this.isFeatured;
	}

	@Override
	public void toggleFeatured() {
		mailLogger.log(Level.INFO, "Enviado desde java.util.logging");
		this.isFeatured = !this.isFeatured;
	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}

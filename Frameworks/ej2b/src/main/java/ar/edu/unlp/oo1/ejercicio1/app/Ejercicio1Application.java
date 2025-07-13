package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.*;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.impl.JSONFormatter;
import ar.edu.unlp.oo1.ejercicio1.impl.MailHandler;
import ar.edu.unlp.oo1.ejercicio1.impl.ShouterFormatter;
import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {
	
	public static void main(String[] args) throws SecurityException, IOException {
		Logger modelLogger = Logger.getLogger("wallpost.model");
		Logger UILogger = Logger.getLogger("wallpost.ui");
		Logger mailLogger = Logger.getLogger("wallpost.extras");

		FileHandler fileHandler = new FileHandler("likes.txt", true);
		fileHandler.setFormatter(new JSONFormatter());

		ConsoleHandler uiHandler = new ConsoleHandler();
		uiHandler.setFormatter(new ShouterFormatter());

		MailHandler mailHandler = new MailHandler();
		mailHandler.setFormatter(new SimpleFormatter());

		modelLogger.addHandler(fileHandler);
		UILogger.addHandler(uiHandler);
		mailLogger.addHandler(mailHandler);

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}

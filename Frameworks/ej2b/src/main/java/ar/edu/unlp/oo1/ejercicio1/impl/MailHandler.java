package ar.edu.unlp.oo1.ejercicio1.impl;

import java.util.Properties;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class MailHandler extends Handler {

    @Override
    public void publish(LogRecord record) {
        try {
            String from = "baltazar.menvielle233597@alumnos.info.unlp.edu.ar";
            String to = "emmaremeslenicov@gmail.com";

            // credenciales
            String username = "af0cbf7eb15dec"; // Completar con su username de mailtrap
            String password = "a1db5f21c526ad"; // Completar con su password de mailtrap

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.mailtrap.io");
            props.put("mail.smtp.port", "587");
            Session session = Session.getInstance(props,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from, "Java logging mail"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Test");
            message.setText(record.getMessage());
            Transport.send(message);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void flush() {}

    @Override
    public void close() throws SecurityException {}
}

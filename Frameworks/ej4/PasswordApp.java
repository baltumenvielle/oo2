import tcp.server.reply.PasswordHandler;
import tcp.server.reply.TCPControlLoop;

import tcp.server.reply.SingleConnectionHandler;

public class PasswordApp {
    public static void main(String[] args) {
        new TCPControlLoop(new SingleConnectionHandler(new PasswordHandler(), "")).startLoop(args);
    }
}

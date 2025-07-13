import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class SingleThreadTCPServer {

    public abstract void handleMessage(String message, PrintWriter out);

    public final void startLoop(String[] args) {
        checkArguments(args);

        int portNumber = Integer.parseInt(args[0]);

    
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            displaySocketInformation(portNumber);
            while (true) {
                Socket clientSocket = acceptAndDisplaySocket(serverSocket);
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            displayAndExit(portNumber);
        }
    }

    protected void displayAndExit(int portNumber) {
        System.err.println("Could not listen on port " + portNumber);
        System.exit(-1);
    }

    protected Socket acceptAndDisplaySocket(ServerSocket serverSocket) throws IOException {
        Socket clientSocket = serverSocket.accept();
        displaySocketData(clientSocket);
        return clientSocket;
    }

    protected void displaySocketData(Socket clientSocket) {
        System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
    }

    protected void displaySocketInformation(int portNumber) {
        System.out.println(this.getClass().getName() + " server listening on port: " + portNumber);
    }

    protected void checkArguments(String[] args) {
        if (args.length != 1) {
            displayUsage();
            System.exit(1);
        }
    }

    protected void displayUsage() {
        System.err.println("Usage: java"+this.getClass().getName() +"<port number>");
    }

    private final void handleClient(Socket clientSocket) {
        
        try (
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                this.handleReceivedMesssage(inputLine, clientSocket);
                
                if (inputLine.equalsIgnoreCase(this.getIgnoredString())) {
                    break; // Client requested to close the connection
                }
                handleMessage(inputLine, out);
            }
            this.handleClosedConnectionMessage(clientSocket);
        } catch (IOException e) {
            this.handleCommunicationErrorMessage(e, clientSocket);
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                this.handleSocketCloseErrorMessage(e, clientSocket);
            }
        }
    }

    protected void handleReceivedMesssage(String inputLine, Socket clientSocket) {
        System.out.println("Received message from " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort() + " - " + inputLine);
    }

    protected String getIgnoredString() { return ""; }

    protected void handleClosedConnectionMessage(Socket clientSocket) {
        System.out.println("Connection closed with " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
    }

    protected void handleCommunicationErrorMessage(IOException e, Socket clientSocket) {
        System.err.println("Communication error with " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort() + " - " + e.getMessage());
    }

    protected void handleSocketCloseErrorMessage(IOException e, Socket clientSocket) { System.err.println("Error closing socket: " + e.getMessage()); }
}

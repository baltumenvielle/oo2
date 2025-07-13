import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer {

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split(" ");

        if (args.length < 2) {
            out.println("Error: Se deben enviar 2 parámetros de entrada por lo menos.");
            return;
        }

        if (args[0] == null) {
            out.println("Error: El string a repetir no puede ser vacio.");
            return;
        }

        String word = args[0];
        String veces = args[1];
        String delimitador = args[2];

        out.println(this.repeatedMessage(word, veces, delimitador));
    }

    private String repeatedMessage(String word, String veces, String delimitador) {
        int repeticiones;

        try {
            repeticiones = Integer.parseInt(veces);

            if (repeticiones <= 0)
                return "Error: la cantidad de repeticiones debe ser mayor a 0";
        } catch (NumberFormatException e) {
            return "Error: El segundo argumento debe ser un numero";
        }

        StringBuilder resultado = new StringBuilder();

        for (int i=0; i<repeticiones; i++) {
            resultado.append(word);

            if (i < repeticiones-1)
                resultado.append(delimitador);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        new RepeatServer().startLoop(args);
    }
}

public class ConnectionAdapter implements Connection {
    private FGConnection fgConnection;

    public ConnectionAdapter() {
        fgConnection = new FGConnection();
    }

    @Override
    public String sendData(String data, int crc) { return fgConnection.transmit(data, crc); }

    @Override
    public String pict() { return fgConnection.symb(); }
}

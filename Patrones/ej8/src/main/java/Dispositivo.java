public class Dispositivo {
    private Ringer ringer;
    private Display display;
    private CRC_Calculator crcCalculator;
    private Connection connection;

    public String send(String data) { return this.connection.sendData(data, this.crcCalculator.crcFor(data)); }
    public void changeCRC(CRC_Calculator crcCalculator) { this.crcCalculator = crcCalculator; }
    public void changeConnection(Connection connection) {
        this.connection = connection;
        this.display.showBanner(this.connection.pict());
        this.ringer.ring();
    }
}

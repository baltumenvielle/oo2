public class Dispositivo {
    private Display display;
    private Ringer ringer;
    private Connection connection;
    private CRCCalculator crcCalculator;

    public String send(String data) {
        long crc = this.crcCalculator.crcFor(data);
        return this.connection.sendData(data, (int)crc);
    }

    public String configurarCRC(CRCCalculator crcCalculator) {
        this.crcCalculator = crcCalculator;
        return "CRC Configuration has changed";
    }
    public String conectarCon(Connection connection) {
        this.connection = connection;
        return "Connection has changed";
    }

}

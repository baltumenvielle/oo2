public class WifiConn implements Connection {
    private String pict;
    @Override
    public String sendData(String data, int crc) { return "Wifi: " + data + " " + crc; }
    @Override
    public String pict() { return this.pict; }
}

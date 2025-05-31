public class FGConnection {
    private String symb;

    public String transmit(String data, int crc) { return "4G: " + data + " " + crc; }

    public String symb() { return this.symb;}
}

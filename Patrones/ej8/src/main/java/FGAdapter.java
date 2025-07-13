public class FGAdapter implements Connection {
    private FGConnection adaptee;
    public String sendData(String data, int crc) { return this.adaptee.transmit(data, crc); }
    public String pict() { return this.adaptee.symb(); }
}

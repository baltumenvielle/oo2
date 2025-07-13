public class StreamAdapter extends Media {
    private VideoStream adaptee;
    public void play() { this.adaptee.reproduce(); }
}

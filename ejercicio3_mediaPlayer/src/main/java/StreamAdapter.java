public class StreamAdapter extends Media {
    private VideoStream stream;

    @Override
    public void play() { stream.reproduce(); }
}

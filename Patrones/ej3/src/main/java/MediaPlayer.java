import java.util.List;

public class MediaPlayer {
    private List<Media> media;
    public void play() { this.media.stream().forEach(m -> m.play()); }
}

import java.util.LinkedList;
import java.util.List;

public class MediaPlayer {
    List<Media> media;

    public MediaPlayer() {
        media = new LinkedList<Media>();
    }

    public void play() {
        media.stream()
                .map(m -> m.play());
    }
}

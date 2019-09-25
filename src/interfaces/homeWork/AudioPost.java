package interfaces.homeWork;

import java.util.Date;

public class AudioPost extends MediaPost implements Playable {
    public AudioPost(String author, Object post, Date date, MessageType messageType) {
        super(author, post, date, messageType);
    }

    @Override
    public void play() {
        System.out.println("Palying: " + this.post);
    }
}

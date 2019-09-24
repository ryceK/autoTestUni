package interfaces.homeWork;

import java.util.Date;

public class VideoPost extends MediaPost {
    public VideoPost(String author, Object post, Date date, MessageType messageType) {
        super(author, post, date, messageType);
    }
}

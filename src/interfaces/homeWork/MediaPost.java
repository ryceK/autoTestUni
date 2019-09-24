package interfaces.homeWork;

import java.util.Date;

public class MediaPost extends Post {
    public MediaPost(String author, Object post, Date date, MessageType messageType) {
        super(author, post, date, messageType);
    }

    @Override
    int maxMessageSize() {
        return 10240;
    }
}

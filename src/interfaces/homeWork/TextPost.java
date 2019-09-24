package interfaces.homeWork;

import java.util.Date;

public class TextPost extends Post {

    public TextPost(String author, Object post, Date date, MessageType messageType) {
        super(author, post, date, messageType);
    }

    @Override
    int maxMessageSize() {
        return 1024;
    }
}

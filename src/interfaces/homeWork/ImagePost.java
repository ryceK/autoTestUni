package interfaces.homeWork;

import java.util.Date;

public class ImagePost extends MediaPost implements Printable{
    public ImagePost(String author, Object post, Date date, MessageType messageType) {
        super(author, post, date, messageType);
    }

    @Override
    public void print() {
        System.out.println("Printing: " + this.post);
    }
}

package interfaces.homeWork;

import java.util.Date;

public abstract class Post {
    String author;
    Object post;
    Date date;
    MessageType messageType;

    public Post(String author, Object post, Date date, MessageType messageType) {
        this.author = author;
        this.post = post;
        this.date = date;
        this.messageType = messageType;
    }

    public String getAuthor() {
        return author;
    }

    public Object getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    void printMessage(){
        System.out.println("");
        System.out.println(post);
    }

    abstract int maxMessageSize();
}

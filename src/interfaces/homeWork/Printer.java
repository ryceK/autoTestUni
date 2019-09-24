package interfaces.homeWork;

public class Printer implements Printable {
    @Override
    public void print(Post post) {
        if (post instanceof TextPost || post instanceof ImagePost){
            System.out.println("Printing: " + post);
        } else {
            System.out.println("Unknown type");
        }
    }
}

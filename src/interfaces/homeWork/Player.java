package interfaces.homeWork;

public class Player implements Playable {
    @Override
    public void play(Post post) {
        if (post instanceof VideoPost || post instanceof AudioPost){
            System.out.println("Palying: " + post);
        } else {
            System.out.println("Unknown type");
        }
    }
}

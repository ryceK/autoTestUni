package innheritance.classWork;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    public Cow(){
        super("Cow");
    }

    @Override
    void saySmth() {
        System.out.println("Moo!");
    }
}

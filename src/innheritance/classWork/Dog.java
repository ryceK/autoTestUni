package innheritance.classWork;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    @Override
    void saySmth() {
        System.out.println("Bark!");
    }
}

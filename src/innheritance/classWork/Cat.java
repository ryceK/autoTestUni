package innheritance.classWork;

public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    void saySmth() {
        System.out.println("Meow!");
    }
}

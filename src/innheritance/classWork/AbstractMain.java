package innheritance.classWork;

public class AbstractMain {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Cow cw = new Cow();

//        c.saySmth();
//        d.saySmth();

        Animal[] animals = new Animal[]{c,d,cw};

        for (Animal animal : animals) {
            animal.saySmth();
        }
    }
}

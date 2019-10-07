package wrappersAndGenerics.homeWork.taskFour;

public class TaskFourMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Barky");
        Dog dog2 = new Dog("Sharik");
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murzik");

        AnimalHouse<Cat> catHouse = new AnimalHouse<>();
//        catHouse.addAnimal(dog1);                          won't compile
        catHouse.addAnimal(cat1);
        catHouse.addAnimal(cat2);

        AnimalHouse<Dog> dogHouse = new AnimalHouse<>();
//        dogHouse.addAnimal(cat1);                         won't compile
        dogHouse.addAnimal(dog1);
        dogHouse.addAnimal(dog2);

        AnimalHouse<Animal> houseForAll = new AnimalHouse<>();

        houseForAll.addAnimal(dog1);
        houseForAll.addAnimal(cat1);

        catHouse.whoIsIn();
        dogHouse.whoIsIn();
        houseForAll.whoIsIn();
    }
}

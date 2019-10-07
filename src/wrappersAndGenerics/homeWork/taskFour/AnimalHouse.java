package wrappersAndGenerics.homeWork.taskFour;

import java.util.ArrayList;

public class AnimalHouse<T extends Animal> {
    private ArrayList<T> house = new ArrayList<>();

    void addAnimal(T animal){
        house.add(animal);
    }

    void whoIsIn(){
        System.out.println("In this house living:");
        for (T a : house){
            System.out.println(a.toString() + " called " + a.getName());
        }
    }
}

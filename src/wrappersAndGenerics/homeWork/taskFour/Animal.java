package wrappersAndGenerics.homeWork.taskFour;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void printName(){
        System.out.println(name);
    }
}

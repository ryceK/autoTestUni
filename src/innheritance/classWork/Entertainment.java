package innheritance.classWork;

public class Entertainment {
    private String name;

    public Entertainment(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Entertainment e = new Movie(2091, "movie");
        e.printName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

}

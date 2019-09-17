package innheritance.classWork;

public class Movie extends Entertainment {
    private int year;

    public Movie(int year, String name) {
        super(name);
        this.year = year;
    }

    public Movie() {
        super("Default movie name");
    }

    @Override
    public void printName() {
        System.out.print("Movie(" + year + ") name is ");
        super.printName();
    }
}

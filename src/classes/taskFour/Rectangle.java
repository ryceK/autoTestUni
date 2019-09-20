package classes.taskFour;

public class Rectangle {
    private int breadth, length;

    public Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    public int getArea(){
        return breadth * length;
    }
}

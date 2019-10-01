package exceptions.classWork;

public class Candy {
    String name;
    Shape shape;
    Color color;

    public Candy(String name, Shape shape, Color color) {
        this.name = name;
        this.shape = shape;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}

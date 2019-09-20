package classes.taskFive;

public class Area {
    public int breadth;
    public int length;

    public void setDim(int breadth, int length){
        this.breadth = breadth;
        this.length = length;
    }

    public int getArea(){
        return this.breadth * this.length;
    }
}

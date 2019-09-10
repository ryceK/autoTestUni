package taskFive;

import taskFour.Rectangle;

public class Area {
    int breadth, length;

    public void setDim(int breadth, int length){
        this.breadth = breadth;
        this.length = length;
    }

    public int getArea(){
        return this.breadth * this.length;
    }
}

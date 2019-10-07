package wrappersAndGenerics.homeWork.taskTwo;

public class PairErasedTypes {
    private Object o;
    private Comparable c;

    public PairErasedTypes(Object o, Comparable c) {
        this.o = o;
        this.c = c;
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public Comparable getC() {
        return c;
    }

    public void setC(Comparable c) {
        this.c = c;
    }
}

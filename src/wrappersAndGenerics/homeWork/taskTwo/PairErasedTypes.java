package wrappersAndGenerics.homeWork.taskTwo;

public class PairErasedTypes {
    private Object key;
    private Comparable value;

    public PairErasedTypes(Object key, Comparable value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Comparable getValue() {
        return value;
    }

    public void setValue(Comparable value) {
        this.value = value;
    }
}

package class8.generic;

public class GenericWildCard<T extends Number> {

    private T type;

    public GenericWildCard(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }
}

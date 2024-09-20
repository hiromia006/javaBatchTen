package class8.generic;

public class Generic<T> {
    private T type;

    public Generic(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }
}

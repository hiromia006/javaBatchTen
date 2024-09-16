package class7.abstraction;

public abstract class Shape {
    // Abstract method (does not have a body)
    abstract void draw();

    // Concrete method
    public void description() {
        System.out.println("This is a shape");
    }
}

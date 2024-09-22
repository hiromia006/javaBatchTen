package class7.abstraction.intefaceClass;

public interface Shape {
    // Abstract method for drawing the shape
    void draw();

    // Abstract method for calculating the area of the shape
    double area();

    // Default method with implementation
    default void description() {
        System.out.println("This is a shape");
    }
}

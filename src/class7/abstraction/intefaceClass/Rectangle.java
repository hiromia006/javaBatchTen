package class7.abstraction.intefaceClass;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }

    @Override
    public double area() {
        return 8.2 * 7.8;
    }
}

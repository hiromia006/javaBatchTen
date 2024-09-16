package class7.abstraction.intefaceClass;

public class Circle implements Shape {
//    private double radius;

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public double area() {
        return Math.PI * 7 * 7;
    }
}

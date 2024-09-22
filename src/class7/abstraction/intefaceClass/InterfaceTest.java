package class7.abstraction.intefaceClass;

public class InterfaceTest {
    public static void main(String[] args) {
        Circle circ = new Circle();
        circ.description();
        circ.draw();
        System.out.println(circ.area());

        Rectangle rect = new Rectangle();
        rect.description();
        rect.draw();
        System.out.println(rect.area());

        Shape shap = new Circle();
        shap.description();
        shap.draw();
        System.out.println(shap.area());
    }
}

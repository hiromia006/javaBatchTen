package class3;

public class MethodTest {
    protected MethodTest() {

    }

    public void printSomeThings() {
        System.out.println("Some Things");
    }

    public String getName() {
        String name = "Shimu";
//      return "Shimu" ;
        return name;
    }

    public void printAddition(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }

    public int getAddition(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public static void main(String[] args) {
        MethodTest test = new MethodTest();
        test.printSomeThings();
        System.out.println(test.getName());
        test.printAddition(10, 25);
        System.out.println(test.getAddition(91,35));
    }
}

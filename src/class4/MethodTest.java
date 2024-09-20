package class4;

public class MethodTest {

    public void printNumber() {
        int number = 100;
        System.out.println("Print number : " + number);
    }

    void printString(String str) {
        printNumber();
        System.out.println("Print String : " + str);
    }

    protected String getName() {

        return "Jahir Uddin Bhuiyan";
    }

    private int getNumber(int number1, int number2) {
        int number;
        number = number1 - number2;
//        return number1 - number2;
        return number;
    }

    public static void main(String[] args) {
        MethodTest test = new MethodTest();
        test.printNumber();
        test.printString("sdmsa  skldslkad");
        System.out.println(test.getName());
        System.out.println(test.getNumber(789, 654));

        new MethodTest().printNumber();
        new MethodTest().printNumber();
        System.out.println(new MethodTest().getName());


    }
}

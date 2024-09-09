package class2;

public class ClassWithMethodAndConstructor extends JavaVariables{
    int number1 = 50;


    // construction
    public ClassWithMethodAndConstructor() {

    }

    // method
    public void printSomeThing() {
        System.out.println("Print SomeThing");
    }

    public static void main(String[] args) {
        ClassWithMethodAndConstructor objectOrInstance = new ClassWithMethodAndConstructor();
        System.out.println(objectOrInstance.number1);
        objectOrInstance.printSomeThing();
    }

}

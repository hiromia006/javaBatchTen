package class6.encapsulation;

public class Student {
    private String name = "Faria";
    private String id;

    public String getName() {
        printMamun();
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private void printMamun() {
        System.out.println("Mamun");
    }
}

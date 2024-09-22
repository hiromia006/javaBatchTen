package class6.encapsulation;

public class StudentTest {
    public static void main(String[] args) {
        Student stud = new Student();
        System.out.println("Name " + stud.getName());

        stud.setId("5664ddd");
        System.out.println("id " + stud.getId());
    }
}

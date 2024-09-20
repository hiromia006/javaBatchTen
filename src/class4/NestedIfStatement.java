package class4;

public class NestedIfStatement {
    public static void main(String[] args) {
        int number = -10; // You can change this value to test other cases

        // Outer if statement
        if (number > 0) {
            System.out.println(number + " is a positive number.");

            // Nested if statement
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } else {
            System.out.println(number + " is not a positive number.");
        }

        System.out.println("This statement is outside the nested if block.");
    }
}

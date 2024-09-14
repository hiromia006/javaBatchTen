package class4;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int score = 79; // You can change this value to test other cases

        // if-else-if ladder for grading system
        if (score >= 90 && score < 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: D");
        } else if (score >= 50 && score <= 59) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        System.out.println("This statement is outside the if-else-if ladder.");
    }
}

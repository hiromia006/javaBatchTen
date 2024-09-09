package class3;

public class TernaryOperator {
    public static void main(String[] args) {
        int number1 = 99, number2 = 20, number;
        number2 = number1 > number2 ? number1 : number2;
        number2 = number1 > number2 ? (number1 == number2 ? number1 : number2) : number2;
        System.out.println(number2);

    }
}

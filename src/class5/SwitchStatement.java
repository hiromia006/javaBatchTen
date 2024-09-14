package class5;

public class SwitchStatement {
    public static void main(String[] args) {
        int day = 30; // Let's say day 3 represents "Wednesday"
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);

        String browserName = "Chrome";

        switch (browserName) {
            case "Firefox":
                System.out.println("Open Firefox Browser");
                break;

            case "Chrome":
                System.out.println("Open Chrome Browser");
                break;

            case "Edge":
                System.out.println("Open edge Browser");
                break;
            default:
                System.out.println("Invalid Browser Name");
                break;
        }
    }
}

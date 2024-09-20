package class5;

// Package name in all lowercase


// Class name in PascalCase
public class Employee {

    // Constant name in all uppercase letters with underscores
    public static final int MAX_AGE = 65;

    // Variable names in camelCase
    private String employeeName;
    private int employeeId;
    private double salary;

    // Constructor name in PascalCase
    public Employee(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method name in camelCase
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Static method name in camelCase
    public static void printMaxAge() {
        System.out.println("The maximum age is: " + MAX_AGE);
    }
}

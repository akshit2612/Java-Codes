import java.util.*;

interface EmployeeInterface {
    void input();
    void show();
    int getID();
    void setID(int id);
}

class Employee implements EmployeeInterface {
    protected int empId;
    protected String name;
    protected int salary;
    private Scanner scanner; // Scanner object made private

    // Constructor initializes Scanner
    public Employee() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void input() {
        System.out.print("Enter Employee ID: ");
        while (!scanner.hasNextInt()) {  // Ensuring only integer input
            System.out.println("Invalid input! Please enter a numeric Employee ID.");
            scanner.next(); // Consume invalid input
        }
        empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Employee Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Salary: ");
        while (!scanner.hasNextInt()) { // Ensuring only numeric salary input
            System.out.println("Invalid input! Please enter a valid salary.");
            scanner.next();
        }
        salary = scanner.nextInt();
    }

    @Override
    public void show() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    @Override
    public int getID() {
        return empId;
    }

    @Override
    public void setID(int id) {
        if (id > 0) {  // Ensuring valid ID
            this.empId = id;
        } else {
            System.out.println("Error: Employee ID must be a positive number.");
        }
    }

    // Closing Scanner to prevent resource leaks
    public void closeScanner() {
        scanner.close();
    }
}

public class EmployeeMain { // Renamed from F1 for clarity
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.input();
        emp.show();
        emp.closeScanner(); // Closing scanner before exiting
    }
}

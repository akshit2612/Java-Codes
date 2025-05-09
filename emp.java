import java.util.*;

abstract class Employee {
    protected int empid;
    protected String name;
    protected int salary;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter empid:");
        empid = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter salary:");
        salary = sc.nextInt();
    }

    public void show() {
        System.out.println("Empid: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    abstract void total_salary();
}

class Worker extends Employee {
    protected int overtime;

    public void input() {
        super.input();
        System.out.println("Enter your overtime wages:");
        overtime = sc.nextInt();
    }

    public void show() {
        super.show();
        System.out.println("Overtime earned: " + overtime);
    }

    public void total_salary() {
        System.out.println("Total Salary: " + (salary + overtime));
    }
}

class Salesman extends Employee {
    protected int ts;
    protected int comm;

    public void input() {
        super.input();
        System.out.println("Enter Sales:");
        ts = sc.nextInt();
    }

    public void show() {
        comm = (10 * ts) / 100; // Calculate commission
        super.show();
        System.out.println("Commission Earned: " + comm);
    }

    public void total_salary() {
        System.out.println("Total Salary: " + (salary + comm));
    }
}

public class emp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Employee e;

        System.out.println("Choose Employee Type: 1. Worker  2. Salesman");
        int choice = sc.nextInt();

        if (choice == 1) {
            e = new Worker();
        } else if (choice == 2) {
            e = new Salesman();
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        e.input();
        e.show();
        e.total_salary();

        sc.close();
    }
}

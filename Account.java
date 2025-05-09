import java.util.*;

class Bank {
    protected int accno;
    protected String name;
    protected double balance; // Changed float to double for better precision
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter Account No: ");
        accno = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Balance: ");
        balance = sc.nextDouble();
    }

    public void show() {
        System.out.println("Account No: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

class Savings extends Bank {
    public void withdraw() {
        System.out.println("Enter the amount to be withdrawn: ");
        double amt = sc.nextDouble();
        if (amt <= balance) { // Allow withdrawal if amt == balance
            balance -= amt;
            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void deposit() {
        System.out.println("Enter the amount to be deposited: ");
        double amt = sc.nextDouble();
        balance += amt;
        System.out.println("Amount Deposited Successfully.");
    }
}

class FD extends Bank {
    private int time;
    private double roi; // Changed float to double

    public void input() {
        super.input();
        System.out.println("Enter Rate of Interest: ");
        roi = sc.nextDouble();
        System.out.println("Enter Time (in years): ");
        time = sc.nextInt();
    }

    public void show() {
        super.show();
        System.out.println("Rate of Interest: " + roi + "%");
        System.out.println("Time in years: " + time);
    }

    public void maturity() {
        double si = balance * roi * time / 100;
        System.out.println("Maturity Amount: " + (balance + si));
    }
}

class Account {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // Use a single Scanner instance

        Savings s = new Savings();
        s.input();
        s.show();
        s.withdraw();
        s.show();
        s.deposit();
        s.show();

        FD f = new FD();
        f.input();
        f.show();
        f.maturity();

        scanner.close(); // Close scanner at the end
    }
}

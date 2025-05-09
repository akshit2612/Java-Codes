import java.util.Scanner;

class Account {
    // Private attributes
    private int accountNumber;
    private String name;
    private float balance;
    private Scanner sc = new Scanner(System.in);

    // Method to take user input
    public void input() {
        System.out.print("Enter Account No.: ");
        accountNumber = sc.nextInt();
        sc.nextLine(); // Clear input buffer
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Initial Deposit: ");
        balance = sc.nextFloat();
    }

    // Method to display account details
    public void show() {
        System.out.println("\nAccount No.: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit amount
    public void deposit() {
        System.out.print("Enter Amount to Deposit: ");
        int amt = sc.nextInt();
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposit Successful! Updated Balance: " + balance);
        } else {
            System.out.println("Invalid Amount! Deposit must be greater than 0.");
        }
    }

    // Method to withdraw amount
    public void withdraw() {
        System.out.print("Enter Amount to Withdraw: ");
        int amt = sc.nextInt();
        if (amt > 0) {
            if (amt <= balance) {
                balance -= amt;
                System.out.println("Withdrawal Successful! Updated Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance! Available Balance: " + balance);
            }
        } else {
            System.out.println("Invalid Amount! Withdrawal must be greater than 0.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        account.input();

        int ch;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Display Account Details");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    account.deposit();
                    break;
                case 2:
                    account.withdraw();
                    break;
                case 3:
                    account.show();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please enter a valid option.");
            }
        } while (ch != 4);

        // Close Scanner to prevent memory leak
        sc.close();
    }
}

import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        sc = new Scanner(System.in);
    }

    public void start() {

        int choice;

        do {

            System.out.println("\n========== ATM ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    System.out.println("Thank You for using our ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);
    }

    private void checkBalance() {
        System.out.printf("Current Balance : ₹%.2f%n", account.getBalance());
    }

    private void deposit() {

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        if (account.deposit(amount))
            System.out.println("Deposit Successful.");
    }

    private void withdraw() {

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        if (account.withdraw(amount))
            System.out.println("Withdrawal Successful.");
    }
}

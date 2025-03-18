import java.util.Scanner;
class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public int withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!!");
            return balance;
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!! New balance: " + balance);
            return balance;
        }
    }

    public int deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount;
            System.out.println("Deposit successful!! New balance: " + balance);
        }
        return balance;
    }

    public int checkBalance() {
        return balance;
    }
}

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(1000);

        while (true) {
            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    userAccount.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    userAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + userAccount.checkBalance());
                    break;
                case 4:
                    System.out.println("Exiting,Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!! Please try again");
            }
        }
    }
}

import Models.Account;
import Models.SavingsAccount;
import Models.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1001, 1000, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount(2001, 500, 100);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());

        checkingAccount.withdraw(600);
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());
    }
}

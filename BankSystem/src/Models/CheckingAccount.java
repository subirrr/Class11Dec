package Models;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountId, double balance, double overdraftLimit) {
        super(accountId, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public void applyOverdraft(double amount) {
        if (amount <= overdraftLimit) {
            System.out.println("Overdraft applied. Current balance: $" + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }


}







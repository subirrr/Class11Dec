package Models;

public class SavingsAccount extends Account {
    private double interestRate;


    public SavingsAccount(int accountId, double balance, double interestRate) {
        super(accountId, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double balance = 0;
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest calculated and added to the account. New balance: $" + balance);
    }

}

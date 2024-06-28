package account;

public class CheckingAccount extends Account {
    protected double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double interestRate, double overdraftLimit) {
        super(accountNumber, balance, interestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > (this.balance + this.overdraftLimit)) {
            System.out.println("Overdraft limit exceeded.");
        } else {
            this.balance -= amount;
        }
    }

    public String toString() {
        return "Account type: Checking Account"
                + "\n Account Number: " + this.accountNumber
                + "\n Balance: " + this.balance
                + "\n Interest Rate: " + this.interestRate
                + "\n Overdraft Limit: " + this.overdraftLimit;
    }
}

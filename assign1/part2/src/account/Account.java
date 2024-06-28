package account;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected double interestRate;

    public Account(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    abstract public void withdraw(double amount);

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount must be positive.");
        }

        this.balance += amount;
    }
}

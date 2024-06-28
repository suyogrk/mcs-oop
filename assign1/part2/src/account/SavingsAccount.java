package account;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, interestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > this.balance) {
            System.out.println("Cannot withdraw more than the account balance.");
        } else {
            this.balance -= amount;
        }
    }

    public String toString() {
        return "Account type: Saving Account"
                + "\n Account Number: " + this.accountNumber
                + "\n Balance: " + this.balance
                + "\n Interest Rate: " + this.interestRate;
    }
}

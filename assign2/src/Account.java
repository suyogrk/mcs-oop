public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;

        return balance;
    }

    public int debit(int amount) {
        if (this.balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
        balance -= amount;

        return balance;
    }

    public int transferTo(Account account, int amount) {
        if (this.balance >= amount) {
            balance -= amount;
            account.credit(amount);
        } else {
            System.out.println("Transfer amount exceeded account balance.");
        }

        return balance;
    }

    public String toString() {
        return "Account[id=" + this.id
                + ", name=" + this.name
                + ", balance=" + this.balance
                + "]";
    }
}

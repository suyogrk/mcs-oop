package account;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new CheckingAccount("John", 10000, 0.5, 2000);
        account.withdraw(13000);
        System.out.println();
        System.out.println(account);

        account.withdraw(12000);
        System.out.println();
        System.out.println(account);

        SavingsAccount sa = new SavingsAccount("John", 10000, 0.5);
        sa.withdraw(12000);
        System.out.println();
        System.out.println(sa);

        sa.deposit(2000);
        sa.withdraw(12000);
        System.out.println();
        System.out.println(sa);
    }
}

package bankaccount;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Cari hesaplar faiz kazandırmaz.");
    }
}

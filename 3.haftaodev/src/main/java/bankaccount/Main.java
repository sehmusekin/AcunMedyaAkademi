package bankaccount;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("Ali Veli", 100000);
        BankAccount checking = new CheckingAccount("Ayşe Yılmaz", 50000);

        savings.calculateInterest();
        checking.calculateInterest();
    }
}


class BankAccount {
    private double balance; // hidden data

    // setter
    public void setBalance(double amount) {
        balance = amount;
    }

    // setter
    public void creditBalance(double amount) {
        balance += amount;
    }

    // getter
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setBalance(5000);
        System.out.println("Balance: " + account.getBalance());
        account.creditBalance(1000);
        System.out.println("Balance: " + account.getBalance());

    }
}

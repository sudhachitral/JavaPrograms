interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}
abstract class BankAccount implements Transaction {
    protected int accountNumber;
    protected double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest(double rate, int time);
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

   
    public double calculateInterest(double rate, int time) {
        return (balance * rate * time) / 100;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12345, 1000);

        sa.deposit(500);
        System.out.println( "deposit amount: "+sa.getBalance());

        sa.withdraw(200);
        System.out.println("withdraw amonut: "+ sa.getBalance());

        double interest = sa.calculateInterest(5, 2);
        System.out.println("Interest" + interest);
    }
}

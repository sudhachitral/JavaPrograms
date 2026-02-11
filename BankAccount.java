// public class Bank
// {
//     private int amount;
//     public int credit(int amount)
//     {
//         if (amount>0)
//         {
//             this.amount+=amount;
//             return this.amount;
//         }
//     }
//     public int debit(int amount)
//     {
//         if (amount>0 && amount<=this.amount)
//         {
//             this.amount-=amount;
//             return this.amount;
//         }
//         else
//         {
//             System.out.println("Insufficient balance");
//             return this.amount;
//         }
//     }
//     public void setamount(int amount)
//     {
//         // this.amount=amount;
//     }
//     public int getamount()
//     {
//         return this.amount;
//     }
//     public class Bank
//     {
//         public static void main(String[] args) {
            
//             Bank b=new Bank();
//             System.out.println(b.getamount());
//             b.setamount(1000);
//             System.out.println(b.getamount());
//         }
//     }
// }
// import java.util.*;

// class Details{
//     String name;
//     int id;
//     double amount;
//     Details(String name, int id, double amount){
//         this.name = name;
//         this.id = id;
//         this.amount = amount;
//     }
//     public void deposit(double amount)
//     {
//         if(amount>0)
//         {
//             this.amount+=amount;
//         }
//     }
//     public void withdraw(double amount)
//     {
//         if(amount>0 && amount<=this.amount)
//         {
//             this.amount-=amount;
//         }
//         else
//         {
//             System.out.println("Insufficient balance");
//         }
//     }
// }
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
    
}
public abstract class BankAccount implements Transaction{
    int accountnumber;
    double balance;
    BankAccount(int accountnumber, double balance){
        this.accountnumber = accountnumber;
        this.balance = balance;
    }
    public abstract int getAccountnumber(int accountnumber);
    {
        return this .accountnumber;
    }
    
    
       
    
    public abstract double getBalance(double balance );
    {
        return this.balance;
    }
   
    public abstract void setBalance(double balance)
    {
        this.balance=balance;
    }
    public abstract double calculateInterest(double balance, double rate, int time);


}
class SavingsAccount extends BankAccount{
    savingsAccount(int accountnumber,double balance){
        super(accountnumber,balance);

    }
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public double calculateInterest(double balance, double rate, int time){
        return (balance*rate*time)/100;
    }
}
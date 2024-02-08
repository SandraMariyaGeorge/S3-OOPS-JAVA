//Write a Java program to create a banking system with three classes - Bank, Savings Account, and CurrentAccount. 
//The bank should have a list of accounts and methods for adding them. 'Accounts' should be an interface 
//with methods to deposit, withdraw, calculate interest, and view balances. 
//SavingsAccount and CurrentAccount should implement the Account interface.
import java.util.*;
interface Account
{
    void deposit(double amount);
    void withdraw(double amount);
    void interest();
    double viewBalance();
}
class SavingsAccount implements Account
{
    private double balance=0;
    public void deposit(double amount)
    {
        balance+=amount;
    }
    public void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void interest()
    {
        double interest=balance*0.05;
        System.out.println("Interest is "+ interest);
    }
    public double viewBalance()
    {
        return balance;
    }
}
class CurrentAccount implements Account
{
    private double balance=0;
    public void deposit(double amount)
    {
        balance+=amount;
    }
    public void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void interest()
    {
        System.out.println(" no Interest in current accounts");
    }
    public double viewBalance()
    {
        return balance;
    }
}
class Bank1
{
    private List<Account> accounts;
    public Bank1()
    {
        this.accounts=new ArrayList<>();
    }
    public void addAccount(Account account)
    {
        accounts.add(account);
    }
    public void displayAllBalances(){
        for(Account account:accounts)
            System.out.println("Account Balance:"+account.viewBalance());
    }
}
public class Bank
{
    public static void main(String[] args) {
        Bank1 bank=new Bank1();

        SavingsAccount sa=new SavingsAccount();
        CurrentAccount ca=new CurrentAccount();


        bank.addAccount(sa);
        bank.addAccount(ca);

        sa.deposit(10000);
        sa.withdraw(500);
        ca.deposit(1000);
        ca.withdraw(500);

        bank.displayAllBalances();
    }
}
package bankingsystem;

public class Account {
    private final String accountNumber;    
    private final double initialAmount;
    private double balance;

    public Account(String accountNumber, double initialAmount) {
        this.accountNumber = accountNumber;
        this.initialAmount = initialAmount;
        balance=initialAmount;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    public void deposite(double amount){
        balance+=amount;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    
    public void addInterestAmount(double amount){
        balance=amount;
    }
}

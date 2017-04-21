package bankingsystemongui;


public class Bank {
    private static final double INTEREST_RATE=0.08;
    private static final double TRANSACTION_FEES=200;
    private  Customer [] customers=new Customer[1000];
       
    public double getINTEREST_RATE(){
        return INTEREST_RATE;
    }
    public double getTRANSACTION_FEES(){
        return TRANSACTION_FEES;
    }
    public Customer[] getCustomers(){
        return customers;
    }
}

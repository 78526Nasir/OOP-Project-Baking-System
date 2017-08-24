package bankingsystem;


public class Customer {
    private static int customerID;
    private final  String customerName;
    private static int noOfCustomer=0;
    private Account account;

    public Customer(String customerName,Account account) {
        this.customerName = customerName;
        this.account=account;
        noOfCustomer++;
        customerID++;
    }
    
    public Account getAccount(){
        return account;
    }
    public String getCustomerName(){
        return customerName;
    }

   
    
    

}

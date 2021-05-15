package javamasterclasssection6;

public class BankAccount {
    //TODO: Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number
    // Create getters and setters for each field
    // Create two additional methods
    //      1. To allow the customer to deposit funds (this should increment the balance filed)
    //      2. To allow the customer to withdraw funds. This should deduct from the balance field, but not allow the withdrawal to computer if there are insufficient funds.
    // You will want to create various code in the Main class to confirm your code is working
    // Add some System.out.println() in the two methods above as well
    //properties
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    //A constructor is a special method that is called when an object is created. A constructor has the same name as the class and does not define a return type. Constructors, like any other method, can accept arguments and be overloaded.
        //Constructor only has access modify and the name of the class

    //Empty Constructor
    public BankAccount() {
        //using "this" to call another constructor
        //call to "this()" must be first statement in constructor body
        this("56789", 2.50, "Default name", "Default Address", "Default Phone Number");
        System.out.println("Empty constructor called");
    }

    //A common use case for constructors is to set, or provide default values for, an object's properties
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
    }

    //Getters and Setters
    public String  getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    //Methods
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.printf("Deposit of $%,.2f made. New balance is $%,.2f%n", depositAmount, this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.printf("Only $%,.2f available. Withdrawal not processed%n", this.balance);
        } else {
            balance -= withdrawalAmount;
            System.out.printf("Withdrawal of $%,.2f processed. Remaining balance is: $%,.2f%n",withdrawalAmount, this.balance);
        }
    }
}

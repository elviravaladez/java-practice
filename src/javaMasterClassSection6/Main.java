package javaMasterClassSection6;

public class Main {
    public static void main(String[] args) {
        //TODO: Car Example
        Car mazda = new Car();
        Car ford = new Car();

        mazda.setModel("Miata");
        System.out.println("Model of the car is: " + mazda.getModel()); // Model of the car is: Miata

        mazda.setModel("MX-5 Miata");
        System.out.println("Model of the car is: " + mazda.getModel()); // Model of the car is: Unknown

        //TODO: Simple Calculator Challenge
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());

        //TODO: Person Challenge
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName()); //fullName =
        System.out.println("teen = " + person.isTeen()); //teen = false

        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName()); //fullName = John
        System.out.println("teen = " + person.isTeen()); //teen = true
        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName()); //fullName = John Smith

        //TODO: Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number
        // Create getters and setters for each field
        // Create two additional methods
        //      1. To allow the customer to deposit funds (this should increment the balance filed)
        //      2. To allow the customer to withdraw funds. This should deduct from the balance field, but not allow the withdrawal to computer if there are insufficient funds.
        // You will want to create various code in the Main class to confirm your code is working
        // Add some System.out.println() in the two methods above as well
        BankAccount emptyAccount = new BankAccount(); //Empty constructor called
        BankAccount corysAccount = new BankAccount("2343", 10.00, "Cory Matthews", "cory.matthews@gmail.com", "123456789"); //calling the constructor

        System.out.println("----------------------------------");
        System.out.println("Account Information for Account #" + corysAccount.getAccountNumber());
        System.out.println("----------------------------------");
        System.out.println("Customer Name: " + corysAccount.getCustomerName());
        System.out.println("Email: " + corysAccount.getCustomerEmailAddress());
        System.out.println("Phone Number: " + (corysAccount.getCustomerPhoneNumber()).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"));
        System.out.printf("Balance: $%,.2f%n",corysAccount.getBalance());

        corysAccount.withdrawal(100.00);
        //Only $10.00 available. Withdrawal not processed
        corysAccount.deposit(50.00);
        //Deposit of $50.00 made. New balance is $60.00
        corysAccount.withdrawal(100.00);
        //Only $60.00 available. Withdrawal not processed
        corysAccount.deposit(51.00);
        corysAccount.withdrawal(100.00);
        //Withdrawal of $100.00 processed. Remaining balance is: $11.00

        BankAccount shawnsAccount = new BankAccount("Shawn Hunter", "shawn.hunter@gmail.com", "12345");
        System.out.println(shawnsAccount.getAccountNumber() + " Customer Name: " + shawnsAccount.getCustomerName());

        //TODO: VipCustomer
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Topanga Lawrence", 2500.00);
        System.out.println(vipCustomer2.getName());

        VipCustomer vipCustomer3 = new VipCustomer("Eric Matthews", 100.00, "eric.matthews@gmail.com");
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getEmailAddress());

        //TODO: Wall
        Wall wall = new Wall(5, 4);
        System.out.println("Area: " + wall.getArea()); //Area: 20.0

        wall.setHeight(-1.5);
        System.out.println("Width: " + wall.getWidth()); //Width: 5.0
        System.out.println("Height: " + wall.getHeight()); //Height: 0.0
        System.out.println("Area: " + wall.getArea()); //Area: 0.0
    }
}

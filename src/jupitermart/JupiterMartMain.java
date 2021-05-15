package jupitermart;

import java.util.ArrayList;

public class JupiterMartMain {
    //TODO: add a class to hold your main method

    //Main Method
    public static void main(String [] args) {
        //TODO: In your main method create products (computers and phones) for a customer to purchase
        Computer comp1 = new Computer(0, 2000, "Apple", false);
        Cellphone cell1 = new Cellphone(1, 1000, "Apple","6.1-inch OLED");


        //TODO: In your main method create a data structure of your choice
        // called shoppingCart.  Add the products you have created.
        ArrayList<Product>shoppingCart = new ArrayList<>();
        shoppingCart.add(comp1);
        shoppingCart.add(cell1);


        //TODO: Create a cashier to work in Jupiter Mart. This cashier
        // should ring up the products in shoppingCart
        Person cashier = new Person("cashier", "1");

        cashier.ringUpCart(shoppingCart);
    }
}

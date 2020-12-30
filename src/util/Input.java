package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;


    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return this.sc.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        return yesNo("Please enter yes or no [yes/no]:");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = this.sc.next();
        return (input.trim().toLowerCase().equals("y") ||
                input.trim().toLowerCase().equals("yes"));
    }
}

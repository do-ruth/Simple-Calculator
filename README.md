# Simple-Calculator
This is a simple calculator that only does basic functions such as addition, subtraction, etc.

/**
 * Ruth Do
 * Created: 02 Feb 2021
 * Last Edited: 02 Feb 2021
 * simple calculator application
 * it will take integers, decimal, and string
 */

//import package to get scanner
import java.util.*;

public class calculator {
    public static void main(String[] args) {

        Scanner mrScanner = new Scanner(System.in);

        //welcome message
        System.out.println("Welcome to Ruth's Simple Calculator!");

        //defining array to store user numbers
        int numbers[] = new int[1];

        //explanation and prompt for input
        System.out.println("I can only add, subtract, multiply, and divide..");
        System.out.println("Choose one and type it out (in all lowercase).");

        String funct;
        funct = mrScanner.nextLine();

        if (funct == "add");
        {
            System.out.println("You chose to add");
        }
        if (funct == "subtract");  //i can't get an else if statement to work for some reason
        {
            System.out.println("You chose to subtract");
        }
        if (funct == "multiply");
        {
            System.out.println("You chose to multiply");
        }
        if (funct == "divide");
        {
            System.out.println("You chose to divide");
        }

    }


}

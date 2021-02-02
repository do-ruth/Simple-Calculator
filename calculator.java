/**
 * Ruth Do
 * Created: 02 Feb 2021
 * Last Edited: 02 Feb 2021
 * simple calculator application
 * it will take integers, decimal, and string
 */

//import package to get scanner
import javax.swing.*;
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


        //initializing a variable to equal 0
        int vari;
        vari = 0;

        /**
         * while loop to catch for invalid input
         * since vari is initially equal to 0,
         * i want the while loop to continue until vari == 1.
         * if the user input is valid then vari will be changed to 1
         * if the user inputs something invalid then the variable will remain 0
         */

        while (vari != 1); {
            String funct;
            funct = mrScanner.nextLine();
            if (funct.equals("add")) {
                vari = vari + 1;
                System.out.println("You chose to add");
            } else if (funct.equals("subtract")) {
                vari = 1;
                System.out.println("You chose to subtract");
            } else if (funct.equals("multiply")) {
                vari = 1;
                System.out.println("You chose to multiply");
            } else if (funct.equals("divide")) {
                vari = 1;
                System.out.println("You chose to divide");
            } else
                System.out.print("Invalid input, try again.");
        }

    }


}

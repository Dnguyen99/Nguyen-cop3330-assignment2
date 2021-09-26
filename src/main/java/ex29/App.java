/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package ex29;
import java.util.*;

class BadInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? ");
                int rate = Integer.parseInt(scan.next());
                System.out.println("It will take " +(72/rate)+ " years to double your initial investment.");
                flag = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Sorry. That is an invalid input.");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Sorry. That is an invalid input.");
            }
            if(flag)
            {
                break;
            }
        }
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package ex25;
import java.util.*;

class Password {
    public static void passwordValidator(String input) {
        int n = input.length();
        boolean hasLower = false, hasUpper = false;
        boolean hasDigit = false, specialChar = false;
        Set<Character>set = new HashSet<Character>
                (Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
        for(char i : input.toCharArray()) {
            if(Character.isLowerCase(i))
                hasLower = true;
            if(Character.isUpperCase(i))
                hasUpper = true;
            if(Character.isDigit(i))
                hasDigit = true;
            if(set.contains(i))
                specialChar = true;
        }
        if(hasDigit && hasLower || hasUpper && specialChar && (n >= 8))
            System.out.println("Very strong.");
        else if((hasLower || hasUpper || specialChar) && (n >= 8))
            System.out.println("Strong.");
        else if(hasLower || hasUpper && (n < 8))
            System.out.println("Weak");
        else
            System.out.println("Very weak.");
    }

    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter password: ");
        input = scan.nextLine();
        passwordValidator(input);
    }
}

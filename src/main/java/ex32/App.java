/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package ex32;
import java.util.Scanner;

class GuessingGame
{
    public static void main( String args[] )
    {
        int i,n,g,a,c=0;
        char ch='y';
        Scanner sc=new Scanner(System.in);
        System.out.println("Lets play Guess Number!");
        while(ch == 'y' || ch == 'Y')
        {
            System.out.print("\nEnter the difficulty level ( 1,2, or 3): ");
            n = sc.nextInt();
            g = (int)Math.floor(Math.random()*(Math.pow(10,n)-1+1)+1);
            System.out.print("I have my number. What's your guess? ");
            while(true)
            {
                a = sc.nextInt();
                if(g == a)
                {
                    c++;
                    System.out.println("You got in " + c + " guesses !");
                    break;
                }
                else if(g > a)
                {
                    System.out.print("Too low. Guess again: ");
                    c++;
                }
                else if(g < a)
                {
                    System.out.print("Too high. Guess again: ");
                    c++;
                }
            }
            System.out.print("\nDo you wish to play again (Y/N)?");
            ch = sc.next().charAt(0);
            c = 0;
        }
    }
}
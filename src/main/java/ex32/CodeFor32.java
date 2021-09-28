package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.*;

public class CodeFor32
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!");

        int rand, guess, total, diff;

        while (true)
        {
            total = 0;

            System.out.print("\nEnter the difficulty level (1, 2, or  3): ");
            diff = input.nextInt();


            if (diff == 1)
                rand = (int) (Math.random() * 10 + 1);
            else if (diff == 2)
                rand = (int) (Math.random() * 100 + 1);
            else
                rand = (int) (Math.random() * 1000 + 1);


            System.out.print("I have my number. What's your guess?: ");
            do
            {
                guess = input.nextInt();
                total++;

                if (guess == rand)
                {
                    System.out.println("You got it in " + total + " guesses!");
                }
                else if (guess < rand)
                {
                    System.out.print("Too low. Guess again: ");
                }
                else if (guess > rand)
                {
                    System.out.print("Too high. Guess again: ");
                }
            } while (guess != rand);

            System.out.print("\nDo you wish to play again (Y/N)? ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n"))
            {
                break;
            }
        }
    }

}

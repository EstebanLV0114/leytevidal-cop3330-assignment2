package ex25;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class CodeFor25 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {

        String Pass = retrieve();
        int strength = determineStrength(Pass);
        System.out.println(retOutput(strength, Pass));

    }

    private static String retrieve()
    {
        System.out.println("Password: ");
        return in.nextLine();
    }

    static String retOutput(int strength, String Pass)
    {
        if(strength == 1)
        {
            return "The password " + Pass + " is very weak.";
        }
        else if(strength == 2){
            return "The password " + Pass + " is weak.";
        }
        else if(strength == 3){
            return "The password " + Pass + " is strong.";
        }
        else if(strength == 4){
            return "The password " + Pass + " is very strong.";
        }
        else{
            return "Password out of constraints of assignment.";
        }
    }

    static int determineStrength(String Pass)
    {

        /*

            Guide:
            A very weak password contains only numbers and is fewer than eight characters.
            A weak password contains only letters and is fewer than eight characters.
            A strong password contains letters and at least one number and is at least eight characters.
            A very strong password contains letters, numbers, and special characters and is at least eight characters.

         */

        boolean num = false, let = false, spechar = false, length = false;
        char[] PassArray = Pass.toCharArray();

        if(Pass.length() >= 8)
        {
            length = true;
        }

        for(int i = 1; i < Pass.length(); i++)
        {
            if(Character.isAlphabetic(PassArray[i]))
            {
                let = true;
            }
            else if(Character.isDigit(PassArray[i]))
            {
                num = true;
            }
            else
            {
                spechar = true;
            }
        }

        if(num && !let && !length && !spechar)
        {
            return 1;
        }
        else if(!num && let && !length && !spechar)
        {
            return 2;
        }
        else if(num && let && length && !spechar)
        {
            return 3;
        }
        else if(num && let && length && spechar)
        {
            return 4;
        }

        return 0;

    }
}

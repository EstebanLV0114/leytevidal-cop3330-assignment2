package ex24;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */


public class CodeFor24 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        String Word1 = retrieve("Enter the first string:");
        String Word2 = retrieve("Enter the second string:");

        boolean Result = isAnagram(Word1, Word2);

        if (Result)
        {
            System.out.println(Word1 + " and " + Word2 + " are Anagrams!");
        }
        else
        {
            System.out.println(Word1 + " and " + Word2 + " are not Anagrams.");
        }

    }


    public static boolean isAnagram(String Word1, String Word2)
    {
        //Sets up inputs to chars for array sort function later
        char[] Array1 = Word1.toCharArray();
        char[] Array2 = Word2.toCharArray();

        if(Array1.length != Array2.length)
        {
            return false;
        }

        //Whole point of using array is to be able to use this function, makes the program sort by alphabetical order so they will be the same.
        Arrays.sort(Array1);
        Arrays.sort(Array2);

        return Arrays.equals(Array1, Array2);

    }

    private static String retrieve(String prompt)
    {
        System.out.println(prompt);
        return scanner.nextLine();
    }

}




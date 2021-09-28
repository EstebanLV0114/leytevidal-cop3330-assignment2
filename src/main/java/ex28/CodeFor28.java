package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.Scanner;

public class CodeFor28
{

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {

        int[] num = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++)
        {
            num[i] = Retrieve();
            sum += num[i];
        }

        System.out.println("The total is: " + sum);

    }

    public static int Sum(int[] num)
    {
        int sum = 0;

        for(int i = 0; i < 5; i++)
        {
            sum += num[i];
        }
        return sum;
    }

    public static int Retrieve()
    {
        System.out.println("Enter a number: ");
        return input.nextInt();
    }

}

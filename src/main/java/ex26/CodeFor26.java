package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.Scanner;
import static java.lang.Math.log;

public class CodeFor26
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        double Bal = Retrieve("What is your balance? ");
        double APR = Retrieve("What is the APR on the card (as a percent)? ");
        double Payment = Retrieve("What is the monthly payment you can make? ");

        Calculator Calc = new Calculator();
        int numM = Calc.MonthsTilPaid(Bal, APR, Payment);

        PrintMonths(numM);
    }

    private static float Retrieve(String prompt)
    {
        System.out.print(prompt);
        return input.nextFloat();
    }

    private static void PrintMonths(int numM)
    {
        System.out.printf("It will take you %d months to pay off this card.\n", numM);
    }

}

class Calculator {
    public int MonthsTilPaid(double Bal, double APR, double Payment)
    {
        double dRate = (APR / 100) / 365;
        double Result = 1 - Math.pow((1 + (dRate)), 30);
        Result = log(1 + ((Bal/Payment) * Result));
        Result /= Math.log(1 + (dRate));
        Result *= -(1.0/30.0);

        return (int) Math.ceil(Result);
    }
}
package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.Scanner;

public class CodeFor29
{

    private static final Scanner Input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int RoR = Retrieve();
        System.out.println("It will take " + YTD(RoR) + " years to double your investment.");
    }

    static int Retrieve()
    {
        String extra;
        while(true)
        {

            System.out.println("What is the rate of return?");
            extra = Input.nextLine();

            try
            {
                double D = Double.parseDouble(extra);
                if((int)D == 0)
                {
                    throw new NumberFormatException();
                }
                return (int)D;
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Sorry, that's not a valid input");
            }
        }

    }

    static int YTD(int RR){
        return 72 / RR;
    }


}

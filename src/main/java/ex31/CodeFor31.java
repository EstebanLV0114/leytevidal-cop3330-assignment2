package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.Scanner;

public class CodeFor31
{
    static Scanner input  = new Scanner(System.in);

    static boolean valid = false;
    public static void main(String[] args)
    {
        int P = CheckInput("Resting Pulse: ");
        int A = CheckInput("Age: ");

        makeTable(P, A);
    }

    public static String makeTable(int P, int A)
    {
        StringBuilder output = new StringBuilder();
        output.append("Intensity\t | Rate\n");
        for (int i = 0; i < 24; i++)
        {
            if (i == 13)
            {
                output.append("|");
                continue;
            }
            output.append("-");
        }

        output.append("\n");
        float intensity;

        for (intensity = 0.55f; intensity < 0.96f; intensity += 0.05f)
        {
            float THR = (((220 - A) - P) * intensity) + P;
            output.append(Math.round(intensity * 100)).append("%\t\t\t | ").append(Math.round(THR)).append(" bpm\n");
        }
        System.out.print(output);
        return String.valueOf(output);
    }

    private static int CheckInput(String text)
    {
        int check = 0;
        while (!valid)
        {
            System.out.print(text);
            String answer = input.next();
            try
            {
                check = Integer.parseInt(answer);
                valid = true;
            }

            catch (NumberFormatException ex)

            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        valid = false;
        return check;
    }
}
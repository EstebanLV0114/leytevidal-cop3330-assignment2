package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.*;

public class CodeFor34
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] arrayList = new String[5];
        arrayList[0] = "John Smith";
        arrayList[1] = "Jackie Jackson";
        arrayList[2] = "Chris Jones";
        arrayList[3] = "Amanda Cullen";
        arrayList[4] = "Jeremy Goodwin";

        System.out.println("There are 5 employees:");
        for(int i=0; i<5; i++) {
            System.out.println(arrayList[i]);
        }

        System.out.println("\nEnter an employee to remove:\n");
        String input = scanner.nextLine();

        String[] newArrayList = new String[5];
        for(int i=0; i<5; i++)
        {

            if(Objects.equals(input, arrayList[i]))
            {

                i = 0;
                continue;
            }
            newArrayList[i] = arrayList[i];
        }

        System.out.println("There are now 4 employees:");
        for(int i=0;i<5; i++)
        {
            if(i == 0)
            {
                continue;
            }
            System.out.println(newArrayList[i]);
        }
    }

}

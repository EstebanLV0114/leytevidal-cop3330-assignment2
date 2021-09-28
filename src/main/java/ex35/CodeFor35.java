package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.*;

public class CodeFor35
{

    public static void main( String[] args )
    {
        ArrayList<String> names = new ArrayList<>(15);
        Scanner input = new Scanner(System.in);
        int namecount = 0;
        String name = "0";

        while(!(name.equals("")))
        {

            System.out.println("\nEnter a name: ");
            name = input.nextLine();

            if(!(name.equals("")))
            {
                names.add(name);
                namecount++;
            }
        }

        int win;
        win = (int)Math.floor(Math.random() * ((namecount - 5) + 3 + 5) - 3);

        for(int i = 0; i < namecount; i++)
        {
            if(i == win)
            {
                System.out.println("\nThe winner is... " + names.get(i) + ".");
            }
        }

    }

}

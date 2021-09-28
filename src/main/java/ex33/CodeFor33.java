package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.*;

public class CodeFor33
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your question?\n> ");
        input.nextLine();

        String[] answers = new String[4];
        answers[0] = "Yes.";
        answers[1] = "No.";
        answers[2] = "Maybe.";
        answers[3] = "Ask again later.";

        int random = rand();

        System.out.println("\n" + answers[random]);

    }

    public static int rand() {
        Random rand = new Random();
        return rand.nextInt(4);
    }

}

package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.*;

public class CodeFor37
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int length = Integer.parseInt(input.nextLine());

        System.out.print("How many special characters? ");
        int spec = Integer.parseInt(input.nextLine());

        System.out.print("How many numbers? ");
        int num = Integer.parseInt(input.nextLine());

        System.out.println("Your password is " + generate(length, spec, num));
    }

    public static String generate(int length, int special, int nums)
    {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String spec = "!@#$%^&*";
        String num = "1234567890";

        Random random = new Random();

        ArrayList<Character> chars = new ArrayList<>();
        for(int i=0; i<special; i++)
        {
            chars.add(spec.charAt(random.nextInt(spec.length())));
        }

        for(int i=0; i<nums; i++)
        {
            chars.add(num.charAt(random.nextInt(num.length())));
        }

        for(int i=chars.size()-1; i<length; i++)
        {
            chars.add(upperCase.charAt(random.nextInt(upperCase.length())));
        }

        for(int i=chars.size()-1; i<length; i++)
        {
            chars.add(lowerCase.charAt(random.nextInt(lowerCase.length())));
        }

        Collections.shuffle(chars);
        String pass = "";

        for(Character stg : chars)
        {
            pass += Character.toString(stg);
        }

        return pass;
    }

}

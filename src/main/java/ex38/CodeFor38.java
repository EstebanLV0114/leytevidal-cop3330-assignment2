package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.*;

public class CodeFor38
{
    public static void main( String[] args )
    {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        int[] num = checkInput();
        int[] even = evenFilter(num);
        System.out.println(finished(even));
    }
    public static int[] checkInput()
    {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        String[] array = number.split("\\s+");
        int[] nums = new int[array.length];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = Integer.parseInt(array[i]);
        }
        return nums;
    }
    public static int[] evenFilter (int[] numbers)
    {
        ArrayList<Integer> list = new ArrayList <Integer> ();
        int length = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 == 0)
            {
                list.add(numbers[i]);
                length++;
            }
        }
        int[] evenNums = new int[length];
        for (int i = 0; i < evenNums.length; i++)
        {
            evenNums[i] = list.get(i);
        }
        return evenNums;
    }
    public static String finished (int[] numbers)
    {
        StringBuilder product = new StringBuilder();
        product.append("The even numbers are");
        for (int i = 0; i < numbers.length; i++)
        {
            product.append(" " + numbers[i]);
        }
        return product.toString();
    }

}

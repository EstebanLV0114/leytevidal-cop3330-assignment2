package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.*;

public class CodeFor36
{
    static Scanner input = new Scanner(System.in);

    static double avg;
    static double max;
    static double min;
    static double std;

    public static void main(String[] args)
    {
        String numAdd = "";
        ArrayList<String> Num = new ArrayList<String>();

        while (!Objects.equals(numAdd, "done"))
        {
            System.out.print("Enter a number: ");
            numAdd = input.next();
            if (!Objects.equals(numAdd, "done"))
            {
                for (int i = 0; i < numAdd.length(); i++)
                {
                    if (Character.isDigit(numAdd.toCharArray()[i]) && !Num.contains(numAdd))
                        Num.add(numAdd);
                }
            }
        }

        ArrayList<Double> doubleNums = ConvertToDouble(Num);

        if (doubleNums.size() > 0)
        {
            avg = checkAvg(doubleNums);
            min = checkMin(doubleNums);
            max = checkMax(doubleNums);
            std = checkStd(doubleNums);
        }
        else
            System.out.println("Numbers list is empty");

        PrintOutput(doubleNums);
    }

    public static ArrayList<Double> ConvertToDouble(ArrayList<String> Nums)
    {
        ArrayList<Double> numDub = new ArrayList<>();
        for (String num : Nums)
        {
            numDub.add(Double.parseDouble(num));
        }
        return numDub;
    }

    public static void PrintOutput(ArrayList<Double> numbers)
    {
        System.out.print("Numbers: ");
        for (Double number : numbers)
        {
            System.out.printf("%.0f, ", number);
        }

        System.out.println("\nThe average is: " + avg);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
        System.out.printf("The standard deviation is: %.2f\n", std);
    }

    public static double checkStd(ArrayList<Double> Nums)
    {
        double tempdev = 0, sum = 0;
        for(double num : Nums)
        {
            sum += num;
        }

        double mean = sum/Nums.size();

        for(double num: Nums)
        {
            tempdev += Math.pow(num - mean, 2);
        }

        return Math.sqrt(tempdev/Nums.size());
    }

    public static double checkMax(ArrayList<Double> Nums)
    {
        double largest = 0;
        for (Double num : Nums)
        {
            if (num > largest)
                largest = num;
        }
        return largest;
    }


    public static double checkAvg(ArrayList<Double> Nums)
    {
        double total = 0;
        for (Double number : Nums)
        {
            total += number;
        }

        return total / Nums.size();
    }

    public static double checkMin(ArrayList<Double> Nums)
    {
        double smallest = 99999;
        for (Double num : Nums)
        {
            if (num < smallest)
                smallest = num;
        }
        return smallest;
    }

}

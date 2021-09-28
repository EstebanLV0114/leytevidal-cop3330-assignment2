package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.Scanner;



public class CodeFor27 {
    /*
        static Scanner input = new Scanner(System.in);
        static String FNEmpty, LNEmpty, FNShort, LNShort, ZipInvalid, IDInvalid = "";

        public static void main( String[] args )
        {
            String FN = getInputs("Enter the first name: ");
            String LN = getInputs("Enter the last name: ");
            String Zip = getInputs("Enter the ZIP code: ");
            String ID = getInputs("Enter the employee ID: ");

            CheckFN(FN);
            CheckLN(LN);
            CheckZip(Zip);
            CheckID(ID);

            PrintResult();
        }

        private static String getInputs(String prompt)
        {
            System.out.print(prompt);
            return input.nextLine();
        }

        private static void CheckFN(String FN)
        {
            if (FN.length() == 0)
                FNEmpty = "The first name must be filled in.\n";
            if (FN.length() <= 2)
                FNShort = "The first name must be at least 2 characters long.\n";
        }

        private static void CheckLN(String LN)
        {
            if (LN.length() == 0)
                LNEmpty = "The last name must be filled in.\n";
            if (LN.length() <= 2)
                LNShort = "The last name must be at least 2 characters long.\n";
        }

        private static void CheckZip(String Zip)
        {
            char[] zipChar = Zip.toCharArray();
            for (char c : zipChar)
            {
                if (Character.isAlphabetic(c))
                    ZipInvalid = "The zipcode must be a 5 digit number.\n";
            }
        }

        private static void CheckID(String ID)
        {
            char[] IDChar = ID.toCharArray();
            if (IDChar.length < 2)
            {
                IDInvalid = "The employee ID must be in the format of AA-1234.";
                return;
            }

            for (int i = 0;  i < 2; i++)
            {
                if (!Character.isAlphabetic(IDChar[i]))
                {
                    IDInvalid = "The employee ID must be in the format of AA-1234.";
                    return;
                }
            }

            if (IDChar[2] != '-')
            {
                IDInvalid = "The employee ID must be in the format of AA-1234.";
                return;
            }

            for (int i = 3; i < IDChar.length; i++)
            {
                if (!Character.isDigit(IDChar[i]))
                {
                    IDInvalid = "The employee ID must be in the format of AA-1234.";
                    return;
                }
            }
        }

        private static void PrintResult()
        {
            System.out.printf("%s%s%s%s%s%s", FNEmpty, FNShort, LNEmpty, LNShort, ZipInvalid, IDInvalid);
        }

*/
}
package ex40;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import java.util.*;

public class CodeFor40
{
    public static ArrayList<HashMap<String, String>> Input()
    {
        ArrayList<HashMap<String, String>> lists = new ArrayList<>();

        HashMap<String, String> John = new HashMap<>();
        John.put("First Name", "John");
        John.put("Last Name", "Johnson");
        John.put("Position", "Manager");
        John.put("SepDate", "2016-12-31");
        lists.add(John);

        HashMap<String, String> Tou = new HashMap<>();
        Tou.put("First Name", "Tou");
        Tou.put("Last Name", "Xiong");
        Tou.put("Position", "Software Engineer");
        Tou.put("SepDate", "2016-10-05");
        lists.add(Tou);

        HashMap<String, String> Michaela = new HashMap<>();
        Michaela.put("First Name", "Michaela");
        Michaela.put("Last Name", "Michaelson");
        Michaela.put("Position", "District Manager");
        Michaela.put("SepDate", "2015-12-19");
        lists.add(Michaela);

        HashMap<String, String> Jake = new HashMap<>();
        Jake.put("First Name", "Jake");
        Jake.put("Last Name", "Jacobson");
        Jake.put("Position", "Programmer");
        Jake.put("SepDate", "");
        lists.add(Jake);

        HashMap<String, String> Jacquelyn = new HashMap<>();
        Jacquelyn.put("First Name", "Jacquelyn");
        Jacquelyn.put("Last Name", "Jackson");
        Jacquelyn.put("Position", "DBA");
        Jacquelyn.put("SepDate", "");
        lists.add(Jacquelyn);

        HashMap<String, String> Sally = new HashMap<>();
        Sally.put("First Name", "Sally");
        Sally.put("Last Name", "Webber");
        Sally.put("Position", "Web Developer");
        Sally.put("SepDate", "2015-12-18");
        lists.add(Sally);

        return lists;
    }

    public static boolean searchFN(int i, String check, ArrayList<HashMap<String, String>> lists)
    {
        for(int j = 0; j < check.length(); j++)
        {
            if(check.charAt(j) != lists.get(i).get("First Name").charAt(j)) return false;
        }
        return true;
    }

    public static boolean searchLN(int i, String check, ArrayList<HashMap<String, String>> lists)
    {
        for(int j = 0; j < check.length(); j++)
        {
            if(check.charAt(j) != lists.get(i).get("Last Name").charAt(j)) return false;
        }
        return true;
    }

    public static void printOutput(String search, ArrayList<HashMap<String, String>> lists)
    {
        for(int i = 0; i < 6; i++)
        {
            if(searchFN(i, search, lists) || searchLN(i, search, lists))
            {
                String FN = lists.get(i).get("First Name") + " " + lists.get(i).get("Last Name");
                String temp = String.format("%-19s | %-17s | %s", FN, lists.get(i).get("Position"), lists.get(i).get("SepDate"));
                System.out.println(temp);
            }
        }
    }

    public static void main( String[] args )
    {

        ArrayList<HashMap<String, String>> listMaps = Input();


        Scanner in = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String check = in.nextLine();
        in.close();


        for(int i = 0; i < 6; i++)
        {
            for(int j = i+1; j < 6; j++)
            {
                if(listMaps.get(i).get("Last Name").charAt(0) >= listMaps.get(j).get("Last Name").charAt(0))
                {
                    HashMap<String, String> temp = listMaps.get(i);
                    listMaps.set(i, listMaps.get(j));
                    listMaps.set(j, temp);
                }
            }
        }


        System.out.println("Results: \n");
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        printOutput(check, listMaps);
    }
}
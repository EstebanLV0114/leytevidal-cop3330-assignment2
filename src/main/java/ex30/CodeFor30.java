package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class CodeFor30 {
    public static void main(String[] args) {
        CodeFor30 MultiTable = new CodeFor30();
        String table = MultiTable.makeTable();
        MultiTable.showTable(table);
    }

    private void showTable(String table) {
        System.out.println(table);
    }

    protected String makeTable() {
        String table = "";
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                int numTable = i * j;
                String NS = nextSpaces(numTable);
                table += String.format("%s%d", NS, numTable);
            }
            table += "\n";
        }
        return table;
    }

    protected String nextSpaces(int numTable) {
        String NS = "";
        int gap = 6;
        String getLength = String.format("%d", numTable);
        int lengthOfNum = getLength.length();
        int numSpaces = gap - lengthOfNum;
        for (int i = 0; i < numSpaces; i++) {
            NS += " ";
        }
        return NS;
    }
}

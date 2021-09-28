package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest
{
    @Test
    void MonthsTilPaid()
    {
        Calculator PC = new Calculator();
        int actual = PC.MonthsTilPaid(5000, 12, 100);
        assertEquals(70, actual);
    }
}

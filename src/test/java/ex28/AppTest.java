package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void addNumbersTrue(){

        CodeFor28 add = new CodeFor28();

        int[] num = {4, 1, 3, 2, 5};
        int result = add.Sum(num);
        int expected = 15;

        assertEquals(expected, result);

    }


}
package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void validData() {

        CodeFor29 Input = new CodeFor29();

        int result = Input.YTD(6);
        int expected = 12;

        assertEquals(expected, result);
    }

}

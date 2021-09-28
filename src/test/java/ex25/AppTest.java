package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void passwordVeryWeak() {
        CodeFor25 veryWeak = new CodeFor25();
        int Result = veryWeak.determineStrength("12345");
        int Actual = 1;

        assertEquals(Result, Actual);
    }

    @Test
    void passwordWeak(){
        CodeFor25  weak = new CodeFor25();
        int Result = weak.determineStrength("abcdef");
        int Actual = 2;

        assertEquals(Result, Actual);
    }

    @Test
    void passwordStrong(){
        CodeFor25 strong = new CodeFor25();
        int Result = strong.determineStrength("abc123xyz");
        int Actual = 3;

        assertEquals(Result, Actual);
    }

    @Test
    void passwordVeryStrong(){
        CodeFor25 veryStrong = new CodeFor25();
        int Result = veryStrong.determineStrength("1337h@xor!");
        int Actual = 4;

        assertEquals(Result, Actual);
    }


}

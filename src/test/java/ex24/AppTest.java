package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void isAnagram_true() {
        CodeFor24 tester = new CodeFor24();
        //Should return true
        boolean Result = tester.isAnagram("cat", "tac");
        assertEquals(Result, true);
    }

    @Test
    void isAnagram_false(){
        CodeFor24 tester = new CodeFor24();
        //Should return false
        boolean Result = tester.isAnagram("tree", "false");
        assertEquals(Result, false);
    }

}

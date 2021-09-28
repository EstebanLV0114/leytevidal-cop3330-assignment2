package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{

    //Using numbers from example

    @Test
    void calculateAvg() {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(400.0, CodeFor36.checkAvg(numbers));
    }

    @Test
    void calculateMin() {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(100.0, CodeFor36.checkMin(numbers));
    }

    @Test
    void calculateMax() {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(1000.0, CodeFor36.checkMax(numbers));
    }

    @Test
    void calculateStd() {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(353.5533905932738, CodeFor36.checkStd(numbers));
    }

}

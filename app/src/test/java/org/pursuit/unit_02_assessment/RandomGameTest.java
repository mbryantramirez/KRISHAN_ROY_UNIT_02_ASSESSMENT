package org.pursuit.unit_02_assessment;

import android.content.Intent;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RandomGameTest {
    public RandomGame randomGame;

    @Before
    public void setUp() throws Exception {
        randomGame = new RandomGame();
    }

    /**
     * This should be confirming that the number returned from the getRandomNumber() method is between 1 and 100 this test is just comparing the values to themselves
     */
    @Test
    public void test_get_random_number_method() {
        int a = randomGame.getRandomNumber();
        int b = randomGame.getRandomNumber();
        int result = a;
        int result1 = b;
        assertEquals(a, result);
        assertEquals(b, result1);
    }

    @Test
    public void test_check_guess_method() {
        int a = 45;
        int b = 45;
        assertTrue(randomGame.checkGuess(a, b));
    }

    @Test
    public void test_get_string_result() {
        boolean tr = true;
        boolean fl = false;
        String whenTrue = "You have guessed correctly!";
        String whenFalse = "Wrong guess - please try again!";
        assertEquals(whenTrue, randomGame.getStringResult(tr));
        assertEquals(whenFalse, randomGame.getStringResult(fl));
    }

    @Test
    public void test_string_to_int() {
        String aNumber = "34";

        assertEquals(34, randomGame.stringToInt(aNumber));

    }
}
// TODO: Initialize any test variables with object values in a "setUp()" method that runs before any of the unit tests.

// TODO: Create a test method called "test_get_random_number_method()". Add logic to confirm that the number returned from the getRandomNumber() method is between 1 and 100, including both 1 and 100.

// TODO: Create a test method called "test_check_guess_method()". Add logic to confirm that the boolean value returned is true if the numbers passed to the checkGuess() method are equal, and false if they are not equal.

// TODO: Create a test method called "test_get_string_result()". Add logic to confirm that the String value returned from the getStringResult() method matches expected output based on what boolean value is passed to the parameter.

// TODO: Create a test method called "test_string_to_int()". Add logic to confirm that the method stringToInt() returns a valid integer value based on the String input provided.


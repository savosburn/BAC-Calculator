/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_assumes_user_is_female() {
        App myApp = new App();

        double bac = 0.08;

        String expectedOutput = "Your BAC is 0.08\n" +
                "It is not legal for you to drive.";

        String actualOutput = myApp.generateOutput(bac);

        assertEquals(expectedOutput, actualOutput);
    }

}
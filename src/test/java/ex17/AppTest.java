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

        double bac = myApp.calculateBAC(175, 2, 3, 1);

        String expectedOutput = "Your BAC is 0.043155\n" +
                "It is legal for you to drive.";

        String actualOutput = myApp.generateOutput(bac);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_user_is_male() {
        App myApp = new App ();

        double bac = myApp.calculateBAC(175, 3, 3, 1);

        String expectedOutput = "Your BAC is 0.049323\n" +
                "It is legal for you to drive.";

        String actualOutput = myApp.generateOutput(bac);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_user_is_male_example_two() {
        App myApp = new App ();

        double bac = myApp.calculateBAC(175, 3, 5, 1);

        String expectedOutput = "Your BAC is 0.092206\n" +
                "It is not legal for you to drive.";

        String actualOutput = myApp.generateOutput(bac);

        assertEquals(expectedOutput, actualOutput);
    }

}
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex17;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static double MALE = 0.73;
    public static double FEMALE = 0.66;
    public static double FORMULA_CONSTANT = 5.14;
    public static double FORMULA_CONSTANT_TWO = 0.015;
    public static double BAC_LIMIT = 0.08;

    public static void main(String[] args) {
        App myApp = new App();

        // input
        double weight = myApp.readWeight();
        int gender = myApp.readGender();

        // User should only enter 0 or 1
        while (gender < 2 || gender > 3) {
            System.out.print("Must enter 2 for female or 3 for male:  ");
            gender = myApp.readGender();
        }

        double alcohol = myApp.readAlcohol();
        double time = myApp.readTime();

        // calculations
        double BAC = myApp.calculateBAC(weight, gender, alcohol, time);

        // output
        String outputString = myApp.generateOutput(BAC);
        myApp.output(outputString);
    }

    public double readWeight() {
        System.out.print("How much do you weigh? ");

        // User can only enter numbers
        while (!in.hasNextDouble()) {
            System.out.print("Invalid weight. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public int readGender() {
        System.out.print("What is your gender?\nEnter a number: Female = 2, Male = 3 ");

        while (!in.hasNextDouble()) {
            System.out.print("Invalid gender. Enter again: ");
            in.next();
        }

        return in.nextInt();
    }

    public double readAlcohol() {
        System.out.print("How many ounces of alcohol have you consumed? ");

        // User can only enter numbers
        while (!in.hasNextDouble()) {
            System.out.print("Invalid alcohol amount. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public double readTime() {
        System.out.print("How many hours has it been since your last drink? ");

        // User can only enter numbers
        while (!in.hasNextDouble()) {
            System.out.print("Invalid amount of time. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public double calculateBAC(double weight, int gender, double alcohol, double time) {
        double r = gender == 3 ? MALE : FEMALE;
        return (alcohol * FORMULA_CONSTANT / weight * r) - (FORMULA_CONSTANT_TWO * time);
    }

    public String generateOutput(double bac) {
        String str1 = String.format("Your BAC is %.6f\n", bac);
        return bac >= BAC_LIMIT ? str1 + "It is not legal for you to drive." : str1 + "It is legal for you to drive.";
    }

    public void output(String outputString) {
        System.out.println(outputString);
    }
}

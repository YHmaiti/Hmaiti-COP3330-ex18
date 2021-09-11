/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program converts temperatures from Fahrenheit
// to Celsius or from Celsius to Fahrenheit. Prompts for the starting
// temperature. The program prompts for the type of
// conversion and then performs the conversion.

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // String variable to store the choice
        String choice;
        // variables to store the temperature in Fahrenheit or celsius accordingly
        Double f;
        Double c;

        // prompt the user for their desired choice
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");

        choice = scanner.nextLine();

        // process to do the conversion depending on the inputted choice
        // using the equations given
        // if the choice is invalid output a message to the screen
        if (choice.equals("C") || choice.equals("c")) {

            System.out.print("Please enter the temperature in Fahrenheit: ");
            f = scanner.nextDouble();

            c = (f - 32) * 5 / 9;

            System.out.print("The temperature in Celsius is " + c + ".");

        } else if (choice.equals("F") || choice.equals("f")) {

            System.out.print("Please enter the temperature in Celsius: ");
            c = scanner.nextDouble();

            f = (c * 9 / 5) + 32;

            System.out.print("The temperature in Fahrenheit is " + f + ".");

        } else {

            System.out.print("The choice entered is invalid, please try again!..");

        }

    }

}
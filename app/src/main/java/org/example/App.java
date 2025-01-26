package org.example;

import java.util.Scanner;

public class App {
  public int getInput(int lowerBound, int upperBound, String prompt, String errorMessage) {
Scanner scanner = new Scanner(System.in);
        int userInput;

        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();
                if (userInput >= lowerBound && userInput <= upperBound) {
                    return userInput; 
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println(errorMessage);
                scanner.next(); 
            }
        }  }

  public static void main(String[] args) {
    App app = new App();

    int lowerBound = 1;
    int upperBound = 100;
    String prompt = "Please enter a value between 1 and 100:";
    String errorMessage = "Your value is invalid. Try again.";

    int userValue = app.getInput(lowerBound, upperBound, prompt, errorMessage);
    System.out.println("The value chosen by the user is " + userValue);
}
 }


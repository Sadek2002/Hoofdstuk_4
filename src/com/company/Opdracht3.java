package com.company;

import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Van welke letter wil je weten of het een klinker is?");
        char userInput = scanner.nextLine().toLowerCase().charAt(0);
        if (userInput == 'a' || userInput == 'e' || userInput == 'o' || userInput == 'u' || userInput == 'i' ) {
            System.out.println("De " + userInput + " is een klinker.");
        } else {
            System.out.println("De " + userInput + " is medeklinker.");
        }
    }
}

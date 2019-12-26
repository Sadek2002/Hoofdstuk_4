package com.company;

import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Van welk karakter wil je weten of het een getal of letter is?");
        char userInput = scanner.nextLine().charAt(0);
        if (Character.isDigit(userInput)) {
            System.out.println("De " + userInput + " is een getal.");
        } else if (Character.isLetter(userInput)) {
            System.out.println("De " + userInput + " is een letter.");
        } else {
            System.out.println("De " + userInput + " is geen getal en ook geen letter.");
        }
    }
}

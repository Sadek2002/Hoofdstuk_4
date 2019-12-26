package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Van welk karakter wil je de ASCII waarde weten?");
	char userInput = scanner.nextLine().charAt(0);
	int ascii = (int) userInput;
        System.out.println("De ASCII waarde van het karakter " + userInput + " is " + ascii + ".");
    }
}

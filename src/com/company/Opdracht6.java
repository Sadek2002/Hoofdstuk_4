package com.company;

import java.util.Scanner;

public class Opdracht6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typ een String:");
        String GebruikerString = scanner.nextLine();
        int lengte = GebruikerString.length();
        char first = GebruikerString.charAt(0);
        char last = GebruikerString.charAt(lengte - 1);
        System.out.println("De lengte van de String is " + lengte + ".");
        System.out.println("Het eerste karakter is " + first);
        System.out.println("Het laatste karakter is " + last);

    }
}

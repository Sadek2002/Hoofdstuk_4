package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Opdracht7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Land 1: ");
        String land1 = scanner.nextLine();
        System.out.println("Land 2: ");
        String land2 = scanner.nextLine();
        System.out.println("Land 3: ");
        String land3 = scanner.nextLine();
        String[] landen = {land1, land2, land3};
        Arrays.sort(landen);
        System.out.println(landen[0] + " - " + landen[1] + " - " + landen[2]);
    }
}

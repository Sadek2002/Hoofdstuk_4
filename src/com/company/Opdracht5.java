package com.company;

import java.util.Scanner;

public class Opdracht5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int letter = (int) (Math.random() * 26 + 97);
        char ascii = (char) letter;
        System.out.println("Uw willekeurige letter is de ‘" + ascii + "’.");
    }
}

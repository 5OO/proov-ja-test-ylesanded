package org.hyperskill;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                // start coding here
        System.out.println("Enter numbers (1 to stop):");
        int input=0;
        while (input !=1) {
            input = scanner.nextInt();
            if (input % 2 == 0) {
                System.out.println("The number is even.  " + input/2);

            } else {
                System.out.println("The number is odd.  " + input * 3 + 1);

            }
        }


    }
}
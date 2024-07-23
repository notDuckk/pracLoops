package org.example;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number:");
            int num = input.nextInt();
            if (num < 0) {
                System.out.println("Number must be a positive number");
                continue;
            } else if (num == 0) {
                break;
            }
        }
    }
}

package org.example;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Do you want to take a break?");
            String choice = input.nextLine();
            if (choice.equals("yes")) {
                break;
            }
        }

    }
}
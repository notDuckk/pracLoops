package org.example;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for (int i = 1;i <= 10; i++){
            int res = i * num;
            System.out.println(num + " x " + i + " = " + res);
        }
    }
}

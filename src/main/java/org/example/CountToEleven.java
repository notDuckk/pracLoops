package org.example;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an number less than 11:");
        int num = input.nextInt();
        int end = 11;
        for (int i = num; i <= end; i++) {
            System.out.println(i);
        }

    }
}

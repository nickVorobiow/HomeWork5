package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int year;
        System.out.println("Введите год:");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();

        if (year % 100 == 0) {
            System.out.println("Год " + year + " не является високосным\n");
        }
        else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным\n");
        }
    }
}

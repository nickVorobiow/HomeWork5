package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        byte monthNumber = 9;

        switch ((byte)monthNumber) {
            case 1,2,12: {
                System.out.println("Это зимний месяц");
                break;
            }
            case 3,4,5: {
                System.out.println("Это весенний месяц");
                break;
            }
            case 6,7,8: {
                System.out.println("Это летний месяц");
                break;
            }
            case 9,10,11: {
                System.out.println("Это осенний месяц");
                break;
            }
            default: {
                System.out.println("Такого месяца не существует");
            }
        }
    }
}

package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        byte clientOS;
        short clientDeviceYear;

        Scanner in = new Scanner(System.in);
        System.out.print("Выберите версию свою ОС:\n" +
                "0- iOS\n" +
                "1- Android\n...");
        clientOS = (byte)in.nextByte();

        System.out.print("\nВведите год выпуска вашей ОС:...");
        clientDeviceYear = (short) in.nextShort();

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("становите облегченную версию приложения для Android по ссылке");
        }
    }
}

package com.company;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        byte clientOS;

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите версию свою ОС:\n" +
                "0- iOS\n" +
                "1- Android\n...");
        clientOS = (byte)in.nextByte();

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}

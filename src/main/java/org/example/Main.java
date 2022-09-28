package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возрас");
        int age = scanner.nextInt();

        switch (age){
            case 0:
                System.out.println("Ты родился");
                break;
            case 18:
                System.out.println("ты совершеннолетен");
                break;
            case 19:
                System.out.println("ты совершеннолетен!");
                break;
            default:
                System.out.println("возраст не определен");
        }
    }
}
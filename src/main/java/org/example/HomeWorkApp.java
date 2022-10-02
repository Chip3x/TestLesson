package org.example;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Apple");
        checkSumSign(3,5);
        printColor(6);
        compareNumbers(2,6);
        }

    public static void printThreeWords(String a, String b, String c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void checkSumSign(int a, int b){
        int c = a +b;
        if (c >=0 ){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value ){
        if (value <= 0){
            System.out.println("Красный");
        }  else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b){
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

package org.example.javahw;

public class Lesson_1 {
    public static void printThreeWords() {  // добавили static
        String a = "Orange";
        String b = "Banana";
        String c = "Apple";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void checkSumSign() {
        int a = 10, b = -20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = -1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 115;
        int b = 45;
        if (a >= b) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }


    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

}




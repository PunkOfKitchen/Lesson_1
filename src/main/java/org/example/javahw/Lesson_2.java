package org.example.javahw;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Lesson_2 {
    public static void twoDigit() {
        int a = 5;
        int b = 4;
        int c = a + b;
        if (c >= 10 && c <= 20)  {
            System.out.print(true);
        }else {
            System.out.print(false);
        }
    }

    public static void positiveOrNegative() {
        int n = 0;
        if (n >= 0) {
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }
    }

    public static void positiveOrNegativeBool() {
        int n = 0;
        if (n >= 0) {
            System.out.print(true);
        }else {
            System.out.print(false);
        }
    }

    public static void printStr() {
        String s = "Привет!";
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static void leapYear() {
        int year = 1200;
        boolean leap = java.time.Year.isLeap(year);
        if (leap) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static void array() {
        int[] arr = {0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
            }else {
                arr[i] = 0;
            }System.out.print(arr[i] + " ");
        }
    }

    public static void arraySecond() {
        int[] arrSec = new
        int[100];
        for (int i = 0; i < arrSec.length; i++){
            arrSec[i] = i + 1;
            System.out.print(arrSec[i] + " ");
        }
    }

    public static void arrThird() {
        int[] arrThird = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arrThird.length; i++) {
            if (arrThird[i] < 6) {
                arrThird[i] = arrThird[i] * 2;
            }System.out.print(arrThird[i] + " ");
        }
    }

    public static void arrDouble() {
        int[][] ints = new
                int[10][10];
        for(int i = 0; i < ints.length; i++){
            for(int j = 0; j < ints.length; j++) {
                System.out.println(ints[i][j] + " ");
            }
        }
    }

    public static void fillDiagonal() {
        int size = 5;
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [] createArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
            System.out.print(result[i] + " ");
        }
        return result;
    }

    public static void main(String[] args) {
        twoDigit();
        positiveOrNegative();
        positiveOrNegativeBool();
        printStr();
        leapYear();
        array();
        arrThird();
        arrDouble();
        fillDiagonal();
        createArray(5, 6);
    }
}


package com.epam.task;
public class task3 {
    public static void main(String[] args) {
        final int lenght = 6;
        int i = 0;
        while (i < lenght) {
            int x = lenght - 1;
            while (x > i) {
                System.out.print(" ");
                x--;
            }
            while (x >= 0) {
                System.out.print("*");
                x--;
            }
            System.out.println();
            i++;
        }
    }
}

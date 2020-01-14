package com.epam.task;
public class task1 {
    public static void main(String[] args) {
        final int lenght= 6;
        int i = 0;
        while (i <=lenght) {
            int x = 0;
            while (x < i) {
                System.out.print('*');
                x++;
            }
            System.out.println();
            i++;
        }

        i=0;
        while (i <= lenght) {
            int x = lenght;
            while (i < x) {
                System.out.print('*');
                x--;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
}
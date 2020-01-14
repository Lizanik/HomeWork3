package com.epam.task;
public class task5 {
    public static void main(String[] args) {
        final int lenght = 6;
        int i = 0;
        while(i < lenght){
            int x = 0;
            while (x < lenght -i) {
                System.out.print(" ");
                x++;
            }
            int a = 0;
            while (a < i*2 + 1) {
                System.out.print("*");
                a++;
            }
            System.out.println();
            i++;
        }
    }
}



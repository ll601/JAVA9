package com.company;

public class HomeWork08 {
    public static void main(String[] args) {
        //打印菱形
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }for (int k = 1; k <=2*-1 ; k++) {
            System.out.print("*");
            for (int j = 1; j <=5; j++) {
                System.out.print(" ");
            }
            for (int i = 1; i <=5 ; i++) {
                System.out.println();
            }
        }

    }
}

package com.company;

public class Demo3 {
    public static void main(String[] args) {
        int max ;
        int num1 = 12;
        int num2 = 3;
        int num3 = 9;

        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else  {
            max = num3;
        }
        System.out.println(max);
    }
}

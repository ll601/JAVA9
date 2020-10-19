package com.company;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        double num1 = input.nextDouble();
        System.out.println("请输入一个数字：");
        double num2 = input.nextDouble();
        System.out.println("请输入一个符号：+ 输入1，-输入2，*输入3，/输入4");
        int  num3 = input.nextInt();
        if (num3 == 1) {
            System.out.println("结果为：" + (num1 + num2));
        } else if (num3 == 2) {
            System.out.println("结果为："+(num1-num2));
        } else if (num3 == 3) {
            System.out.println("结果为：" + (num1 * num2));
        } else if (num3 == 4) {
            System.out.println("结果为：" + (num1 / num2));
        }
    }
}

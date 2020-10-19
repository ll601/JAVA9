package com.company;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = input.nextInt();
        System.out.println("请输入第二个整数");
        int b = input.nextInt();
        System.out.println("请输入第三个整数");
        int c = input.nextInt();
        int t ;
        if (a>b){
            t = a;
            a = b;
            b = t;
        }
        if (b>c){
            t = b;
            b = c;
            c = t;
        }
        if (a>c){
            t = a;
            a = c;
            c = a;
        }
        System.out.println(a+"<"+b+"<"+c);
    }
}

package com.company;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int numA=input.nextInt();
        System.out.println("请输入一个整数：");
        int numB=input.nextInt();
        System.out.println("请输入一个整数：");
        int numC=input.nextInt();
        int a=numA,b=numB,c=numC;
        int max,min;
        max=(numA>numB)?numA:numB;
        max=(max>numC)?max:numC;
        min=(numA<numB)?numA:numB;
        min=(min<numC)?min:numC;
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);

    }
}

package com.company;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("请输入月份：");
        int month=num.nextInt();
        if ((month>=3)&&(month<=5)){
            System.out.println("春季");
        }else if((month>=6)&&(month<=8)) {
            System.out.println("夏季");
        }else if((month>=9)&&(month<=11)){
            System.out.println("秋季");
        }else {
            System.out.println("冬季");
        }
    }
}

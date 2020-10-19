package com.company;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的JAVA成绩：");
        int sroce = input.nextInt();
        System.out.println("请输入您的音乐成绩：");
        int ysroce = input.nextInt();
        if((sroce>90 && ysroce>80) || (sroce == 100 && ysroce >70)){
            System.out.println("奖励一个oppo手机！");
        }
    }
}

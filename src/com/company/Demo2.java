package com.company;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入岳小鹏的JAVA成绩：");
        int sorce = input.nextInt();
        if(sorce==100){
            System.out.println("奖励BMW一辆！");
        }else if(sorce>=80&&sorce<=90){
            System.out.println("奖励iPhone 11");
        }else if(sorce>=60&&sorce<=80){
            System.out.println("奖励Ipad");
        }else {
            System.err.println("考的什么鬼看我不打死你个龟孙！！！");
        }
    }
}

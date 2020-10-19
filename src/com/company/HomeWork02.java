package com.company;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {

        double avg = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入周" + i + "的学习时间:");
            double times = input.nextDouble();
            sum+=times;
        }
        avg =sum/5;
        System.out.println("周一~周5学习平均为：" + avg+"小时！");
    }
}

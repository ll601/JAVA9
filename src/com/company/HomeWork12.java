package com.company;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        /*
         * 1、输入3个班，每班5个学生的成绩，求每个班的总分、平均分、最高分、最低分。
         * */

        double sum = 0;
        double avg = 0;
        double max = 0, min = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "班的:");
            for (int j = 0; j < 5; j++) {
                System.out.print("第" + (j + 1) + "个学生的成绩");
                double sorce = input.nextDouble();
                if (sorce > max) {
                    max = sorce;
                } else if (sorce < min && sorce != 0) {
                    min = sorce;
                }
                sum += sorce;
                avg = sum / 5;
            }
            System.out.println("第" + (i + 1) + "个班的总分为:" + sum);
            System.out.println("第" + (i + 1) + "个班的平均分为:" + avg);
            System.out.println("第" + (i + 1) + "个班的最高分为:" + max + "\t最低分为:" + min);

        }

    }
}

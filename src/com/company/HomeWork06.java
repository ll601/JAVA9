package com.company;

import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {
/*        int max = 0;
        int min = 0;
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个整数(输入0结束):");
        int num =input.nextInt();

        while (true){

            if (num>max){
                max=num;
            }if (num<min){
                min=num;
            }
            System.out.println("请输入一个整数(输入0结束):");
            num = input.nextInt();
            if (num==0){
                break;
            }
        }

        System.out.println("最大值："+max+"\t最小值："+min);*/

        Scanner sc = new Scanner(System.in);
        // 获取键盘录入数据
        System.out.println("请输入一个整数（du输入0结束）：");
        int number = sc.nextInt();
        // 定义最大值和最zhi小值变量并赋值
        int max = number;
        int min = number;
        // 因不知道循环次数，所以while循环条件使用true
        while (true) {
            // 判断获取数据的最大值
            if (number > max) {
                max = number;
            }
            // 判断获取数据的最小值
            if (number < min & min > 0) {
                min = number;
            }
            // 获取键盘录入数据
            System.out.println("请输入一个整数（输入0结束）：");
            number = sc.nextInt();
            // 当输入的数据是0时，则结束程序
            if (number == 0) {
                break;
            }
        }
        // 控制台输出结果
        System.out.println("最大值是：" + max + "，最小值是：" + min);
    }
}

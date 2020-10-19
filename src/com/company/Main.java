package com.company;

import java.util.Scanner;

//测试类
public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.logo = "SONY";
        phone.battery.power = 100;

        Scanner reader = new Scanner(System.in);
        int command = 0;
        boolean sign = true;
        System.out.println("输入1听音乐\n输入2充电\n输入3显示电量\n");
        while (sign) {
            command = reader.nextInt();
            switch (command) {
                case 1:
                    System.out.println("听音乐");
                    break;
                case 2:
                    System.out.println("充电");
                    break;
                case 3:
                    System.out.println("显示电量");
                    break;
                case 4:
                    sign = false;
                    break;
                default:
                    break;
            }
        }
    }
}

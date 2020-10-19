package com.company;

import java.util.Scanner;

public class HomeWork07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        do{
            System.out.print("请输入一个数：");
            int a= input.nextInt();
            switch (a){
                case (0):
                    System.out.println("石头");
                    break;
                case (1):
                    System.out.println("剪刀");
                    break;
                case (2):
                    System.out.println("布");
                    break;
            }
            System.out.print("是否继续出拳（y/n）:");
            String bit=input.next();
            if (!bit.equals("y")){
                System.out.println("退出程序");
                break;
            }
        }while(true);
    }
}

package com.company;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入机票原价：");
        int q=input.nextInt();
        System.out.print("请输入月份：");
        int w=input.nextInt();
        System.out.println("请输入选择的舱位,头等舱输入1，商务舱输入2，经济舱输入3:");
        int e=input.nextInt();
        if(w<=10&&w>=4) {
            System.out.println("旺季");
            if (e == 1) {
                System.out.println("你的机票价格为："+q*0.9);
            }
            if (e==2){
                System.out.println("你的机票价格为："+q*0.8);
            }
            else if(e==3){
                System.out.println("你的机票价格为："+q*0.7);
            }

        }else if(w<=4||w>=10){
            System.out.println("淡季");
            if (e == 1) {
                System.out.println("你的机票价格为："+q*0.5);
            }
            if (e==2){
                System.out.println("你的机票价格为："+q*0.4);
            }
            else if(e==3){
                System.out.println("你的机票价格为："+q*0.3);
            }
        }

    }
}

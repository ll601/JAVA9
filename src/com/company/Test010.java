package com.company;

import java.util.Scanner;

public class Test010 {
    public static void main(String[] args) {
        Scanner award=new Scanner(System.in);
        System.out.println("小明的成绩为：");
        int score=award.nextInt();
        if (score==100){
            System.out.println("想干啥就干啥");
        }else if(score>=90){
            System.out.println("看电视、吃零食");
        }else if(score>=60&&score<90){
            System.out.println("看书，写作业");
        }else if(score<=60){
            System.out.println("做家务、洗碗、拖地");
        }
    }
}

package com.company;

public class HomeWork13 {
    public static void main(String[] args) {
        /*
        * 2、判断1-100之间有多少个质数并输出所有质数。
        * */

        int count=0;
        for (int i = 2; i <= 100; i++) {
            int j=2;
            for (j = 2; j <= i; j++) {
                if (i % j == 0){
                    break;
                }
            }
            if(i==j){
                System.out.print(i+"\t");
                count++;
                if(count%8==0){
                    System.out.println();
                }
            }
        }
    }
}

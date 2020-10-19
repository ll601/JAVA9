package com.company;

public class HomeWork03 {
    public static void main(String[] args) {
        double mony = 10000;//本金
         double sum =0;
        for (int i = 1; i <=5 ; i++) {
            sum = (mony*0.003)+mony;
        }
        System.out.println("5年后，获得的本金是"+sum);
    }
}

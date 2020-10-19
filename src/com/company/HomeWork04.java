package com.company;

public class HomeWork04 {
    public static void main(String[] args) {

        for (int i = 1; i <=100 ; i++) {
            if (i%3==0 && i%5 !=0){
                System.out.println("Flip");
            }if(i%5==0 && i%3!=0){
                System.out.println("Flop");
            }if (i%3==0 && i%5==0){
                System.out.println("FlipFlop");
            }else if(i%3!=0&&i%5!=0){
                System.out.println(i);
            }
        }
    }
}

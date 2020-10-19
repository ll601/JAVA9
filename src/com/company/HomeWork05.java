package com.company;

public class HomeWork05 {
    public static void main(String[] args) {
        int x=0;
        for(int i=100;i<=999;i++){
            int b = i / 100;
            int c = (i - 100 * b) / 10;
            int d = (i - 10 * c - 100 * b);

            if (i == b * b * b + c * c * c + d * d * d ) {
                x++;
                System.out.print("\n"+i );
            }
        }
        System.out.println();
        System.out.println("水仙花数"+x+"个数");
    }
}

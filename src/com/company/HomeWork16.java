package com.company;

import java.util.Scanner;

public class HomeWork16 {
    public static void main(String[] args) {
        /*
        * 使用双重循环根据用户输入的数字输出等腰三角形
        * */
        /*
        * for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        * */

        Scanner input = new Scanner(System.in);
        System.out.println("请输入三角形的行数：");
        int num = input.nextInt();
        int i, j;
        for(i = 1; i <=num; i++) {
            for (int k = 0; k <=num-i ; k++) {
                System.out.print(" ");
            }
            for(j = 1; j <=2*i-1; j++){
                System.out.print(i);

            }
            System.out.print("\n");
        }
        /*System.out.println("请输入直角三角形的行数：");
        int rows = 0;// 记录三角形行数
        Scanner input = new Scanner(System.in);
        rows = input.nextInt();

        for (int i = 0; i < rows; i++) {

            for (int k = 0; k < 4 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i- 1; j++) {

                System.out.print("*");
            }

            System.out.println();

        }*/
    }
}

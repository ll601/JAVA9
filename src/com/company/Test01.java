package com.company;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        char weekFirst;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入周一到周日的第一个字母:");
        String letter = input.next();
        if (letter.length() == 1){
            char week = letter.charAt(0);
            switch (week){
                case 'm':
                case 'M':
                    System.out.println("星期一（Monday）");
                    break;
                case 't':
                case 'T':
                    System.out.println("由于星期二(Tuesday)与星期四(Thursday)均以字母T开头，" + "需输入第二个字母才能正确判断：");
                    letter = input.next();
                    if (letter.length() ==1){
                        weekFirst = letter.charAt(0);
                        if (weekFirst =='U' || weekFirst == 'u' ){
                            System.out.println("星期二(Thursday)");
                            break;
                        }else if (weekFirst == 'H' || weekFirst =='h'){
                            System.out.println("星期四(Thursday)");
                            break;
                        }else {
                            System.err.println("输入错误，程序结束！");
                            break;
                        }
                    }else {
                        System.err.println("输入错误，只能输入一个字母，程序结束！");
                        break;
                    }
                case 'w':
                case 'W':
                    System.out.println("星期三（Wednesday）");
                    break;
                case 'f':
                case 'F':
                    System.out.println("星期三（Friday）");
                    break;
                case 's':
                case 'S':
                    System.out.print("由于星期六(Saturday)与星期日(Sunday)均以字母S开头，需输入第二个字母才能正确判断：");
                    letter = input.next();
                    if (letter.length() ==1){
                        weekFirst = letter.charAt(0);
                        if (weekFirst == 'A' || weekFirst == 'a'){
                            System.out.println("星期六(Saturday)");
                            break;
                        }else if(weekFirst == 'U' || weekFirst == 'u'){
                            System.out.println("星期日(Sunday)");
                            break;
                        }else {
                            System.err.println("输入错误，程序结束！");
                            break;
                        }
                    }else {
                        System.err.println("输入错误，只能输入一个字母，程序结束！");
                        break;
                    }
                default:
                    System.err.println("输入错误，程序结束！");
                    break;
            }
        }else {
            System.err.println("输入错误，只能输入一个字母，程序结束！");
        }

    }
}

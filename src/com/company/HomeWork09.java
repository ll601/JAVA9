package com.company;

import java.util.Scanner;

public class HomeWork09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name,password;
        boolean flgn = false;
        for (int i = 1; i <=3 ; i++) {
            System.out.println("请输入用户名:");
            name = input.next();
            System.out.println("请输入密码:");
            password =input.next();
            if (name.equals("admin")&&password.equals("123456")){
                flgn = true;
                break;
            }else{
                System.err.println("输入错误！你还有"+(3-i)+"次机会！请重新输入:");
            }
        }
        if (flgn ==true){
            System.out.println("登录成功，欢迎进入晋江文学城！");
        }else{
            System.err.println("输入错误！登录失败！");
        }

    }
}

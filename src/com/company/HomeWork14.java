package com.company;

public class HomeWork14 {
    public static void main(String[] args) {
        /*
        * 3、使用循环输出 100、95、90、85.......5
          提示：可尝试使用for、while、do-while三种循环实现
        * */

        /*for (int i = 100; (i <= 100) && (i != 0); i = i - 5){
            System.out.println(i);
        }*/
        int i = 100;
        while(i>=5){

            System.out.println(i);
            i-=5;
        }
       /* int i = 100;
        do {
            System.out.println(i);
            i-=5;
        }while (i>=5);*/
    }
}

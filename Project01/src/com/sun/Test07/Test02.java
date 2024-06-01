package com.sun.Test07;

import java.util.Random;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Random r=new Random();
       int number= r.nextInt(100)+1;
        System.out.println("number = " + number);
        Scanner scanner=new Scanner(System.in);
        int i = 0;
        for (; i < 5; i++) {
            System.out.println("请输入你要猜的数字：");
           int guessNumber= scanner.nextInt();
           if(number>guessNumber){
               System.out.println("您猜的数字小了，请继续！");
           } else if (number<guessNumber) {
               System.out.println("您猜的数字大了，请继续！");
           }
               else{

               System.out.println("恭喜您，猜对了");
               break;
           }
        }
        if(i==5)
        System.out.println("游戏失败");


    }
}

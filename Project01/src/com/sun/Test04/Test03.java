package com.sun.Test04;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
      Random rd=new Random();
      Scanner sc=new Scanner(System.in);
      int num =rd.nextInt(100)+1;
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第"+i+"个数字:");
            int n=sc.nextInt();
            if(num==n)
            {
                System.out.println("恭喜您，猜对了!");
                return;
            }
            else if (num>n) {
                System.out.println("您猜的数字小了!");
            }
            else if (num<n) {
                System.out.println("您猜的数字大了!");
            }
        }

    }
}

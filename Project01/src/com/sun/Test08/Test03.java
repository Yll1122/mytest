package com.sun.Test08;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Random random = new Random();
        int r=random.nextInt(100) + 1;
        System.out.println(r);
        guessNum(r);

    }

    public static void guessNum(int r) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int a = scanner.nextInt();
            if (a == r) {
                System.out.println("恭喜您，猜对了");
                return;
            } else if (a>r) {
                System.out.println("您猜的数字大了");
            }else
                System.out.println("您猜的数字小了");
        }
        System.out.println("游戏结束");
    }
}

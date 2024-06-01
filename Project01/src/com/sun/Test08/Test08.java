package com.sun.Test08;

import java.util.ArrayList;
import java.util.Random;

public class Test08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        System.out.println("-------------------");
        for (Integer i : list) {
            if (i % 2 == 0) {
                if (!list1.contains(i))
                list1.add(i);
            }
        }
        System.out.print(list1);

    }
}

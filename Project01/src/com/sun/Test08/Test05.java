package com.sun.Test08;

import java.util.ArrayList;
import java.util.List;

public class Test05 {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("刘备");
        list.add("孙权");
        list.add("张飞");
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list.get(1));
    }
}

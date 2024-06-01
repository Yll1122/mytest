package com.sun.homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(83,72,83,83,77,75,72,72,67,65));
        System.out.println("72的索引是："+findIndex(list,72));
        System.out.println("替换前"+list);
        replace(list,72,27);
        System.out.println("替换后"+list);
    }
    public static int findIndex(List<Integer> list, int i){
        int index = -1;
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == i) {
                index = j;
                break;
            }
        }
        return index;
    }
    public static void replace(List<Integer> list,Integer oldValue,Integer newValue){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==oldValue) {
                list.set(i, newValue);
            }
        }
    }
}

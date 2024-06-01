package com.sun.Test14;
import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static List<Integer> getEvenNum(List<Integer> list){//List接口
        ArrayList<Integer> evenList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if(integer%2==0){
                evenList.add(integer);
            }

        }
        return evenList;//子类可以返回
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        ArrayList<Integer> list=(ArrayList<Integer>) getEvenNum(arrayList);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

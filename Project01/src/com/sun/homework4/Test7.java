package com.sun.homework4;
import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        MyList myList = new MyList();
        for (int i = 0; i < 3; i++) {
            myList.add(i);
        }
        System.out.println("添加元素后:");
        myList.show();
        Integer remove = myList.remove();
        System.out.println("获取元素:");
        System.out.println(remove);
        System.out.println("获取元素后:");
        myList.show();
    }
}
  class MyList{
private ArrayList<Integer> list=new ArrayList<>();
public void add(int i){
    list.add(i);
}
public void show(){
    System.out.println(list);
}
public int remove(){
    return list.remove(list.size()-1);
}
  }

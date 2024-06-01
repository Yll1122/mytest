package com.sun.Test08;


public class MyArrayList<E> {
   public void showName(E e){
       System.out.println("姓名:"+e);
   }
   public E getName(E e){
       return e;
   }

    public static void main(String[] args) {
        MyArrayList<String> list=new MyArrayList<>();
        list.showName("杨玲玲");
        list.showName(list.getName("杨玲"));
    }
}

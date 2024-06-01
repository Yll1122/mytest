package com.sun.Test17;

import com.sun.Test08.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void show(List list){

    }

    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        Object o1=new Object();
        Student student=new Student();
        list.add(o1);//把Object传入list
        list.add(student);//把Student对象传入list
        /*因为list.add(Object obj)需要传入的类型是Object类型，
        所以Object包括它的子类都可以往里面传。
        但是如果是接口，则不能传入自己，因为接口无法实例化。
         */
    }
}

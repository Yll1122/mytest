package com.sun.Test07;

import java.util.ArrayList;

public class Test04 {
    //ArrayList类可以调用的方法有：
    /*
    1.remove(index)删除指定下标的元素
    2.clear()删除内存中保存的所有元素
    3.get(index)获取指定元素的值
    4.size()获取ArrayList类中数据长度大小
    5.add()往数组里面添加元素
    6.数组里的元素无法进行删除，只能把数组里的元素清除赋空。
    7.set（index,content）更新指定下标的内容
    8.toArray（）用于把list转换成数组。
    9.contatins(content)用于判断集合中是否包含指定元素，返回值是Boolean类型
     */
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();//只能存放String类型的数组，数组长度不限
        list.add("杨玲玲");
        list.add("杨玲雪");
        list.add("杨玲霄");
        for (String s : list) {//遍历ArrayList数组
            System.out.println(s);
        }
        Object[] objects = list.toArray();//把list转成数组
        System.out.println(objects);
        System.out.println("-----------------");
            System.out.println(list);//打印整个list数组
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));//遍历list数组
        }
        list.remove(2);
        list.clear();
        System.out.println(list);
    }
}

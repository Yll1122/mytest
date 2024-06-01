package com.sun.Test12;

 abstract public class Animal {
    public abstract void cry();
    public abstract void show();
}
class Cat extends S {
    public void cry(){
        System.out.println("喵喵喵");
    }
    public void show(){}
}
class Dog extends S {
    public void cry(){
        System.out.println("汪汪汪");
    }
    public void show(){
        System.out.println("小狗会跳舞");
    }
}
 class Sheep extends S {
    public void cry(){
        System.out.println("咩咩咩");
    }
    public void show(){}
}

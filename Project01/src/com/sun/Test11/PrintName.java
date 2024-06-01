package com.sun.Test11;

public interface PrintName {
    public abstract void  eat();
    private void show(){
        System.out.println("我是show");
    }
    public default void method(){
        System.out.println("我是默认方法");
    }
    public static void run(){
        System.out.println("跑起来");
    }
}
class Animal implements  PrintName{
    public void method(){
        System.out.println("我是重写后的默认方法");
    }
    //实现接口中的所有抽象方法，如果不能都实现，则类必须定义成抽象类。
    public void eat(){
        System.out.println("吃东西");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.method();
        PrintName.run();
    }
}

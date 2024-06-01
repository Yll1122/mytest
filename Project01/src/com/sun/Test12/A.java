package com.sun.Test12;

public interface A {
    public default void show(){
        System.out.println("我是A中的show方法");
    }
}
interface B{
    public default void show(){
        System.out.println("我是B中的show方法");
    }
}

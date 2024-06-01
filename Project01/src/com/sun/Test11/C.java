package com.sun.Test11;

import java.sql.SQLOutput;

interface A {
public default void showA(){
    System.out.println("aaa");
}
public abstract void show();
}
interface B {
public abstract void showB();
public abstract void show();
}
public class C extends D implements A,B{
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.showA();
        c.showB();
    }
}



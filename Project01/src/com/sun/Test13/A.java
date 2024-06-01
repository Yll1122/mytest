package com.sun.Test13;

public interface A {
    default void show() {
        System.out.println("我是A中show方法");
    }

    default void print() {
        System.out.println("我是打印方法");
    }
    private void show3(){

    }
}

interface B {
    default void show() {
        System.out.println("我是B中show方法");
    }

    default void print1() {
        System.out.println("我是打印方法1");
    }
}

class D {
    public void print1() {
        System.out.println("我是D类中的方法");
    }
}

class C extends D  implements B{
    public static void main(String[] args) {
        C c = new C();
        c.print1();
    }
}
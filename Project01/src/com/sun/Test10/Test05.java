package com.sun.Test10;

public class Test05 {
    {
        //普通代码块在构造方法调用之前输出一次
        System.out.println("我是普通代码块");
    }

    Test05() {
        System.out.println("我是普通构造方法");
    }

    Test05(boolean b) {
        System.out.println("我是布尔构造方法");
    }

    public static void main(String[] args) {
        new Test05();
        new Test05(true);
    }
}

package com.sun.Test12;

public interface LiveAble {
     static void run() {
        System.out.println("跑起来~~~");
    }
}

class S implements LiveAble {
// 无法重写静态方法
    static void run(){
        System.out.println("跑起来~~~");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        LiveAble.run();
    }
}
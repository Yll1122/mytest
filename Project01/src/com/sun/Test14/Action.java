package com.sun.Test14;

import com.sun.Test12.Test;

public interface Action {
    void fly();
    void run();
}
class Test01{
    public static void main(String[] args) {
        Action action=new Action() {
            @Override
            public void fly() {
                System.out.println("飞的更高");
            }

            @Override
            public void run() {
                System.out.println("跑的更快");
            }
        };
        showFly(action);//调用showFly方法；传递action==整个匿名内部类，f==action，调用f.run,f.fly方法
    }
    public static void showFly(Action f){//接口作为形式参数
    f.run();//接口调用接口里的方法
    f.fly();
    }
}

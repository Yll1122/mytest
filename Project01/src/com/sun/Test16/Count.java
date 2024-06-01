package com.sun.Test16;
public abstract class Count {
    public abstract void show();

    public static void main(String[] args) {
        Count count=new Count() {
            @Override
            public void show() {
                System.out.println("我是show方法");
            }
        };
        count.show();
    }
}

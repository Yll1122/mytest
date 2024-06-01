package com.sun.Test16;
public  class Demo1 {
    public final double PI=3.14;
    public double getPI() {
        return PI;
    }

    public final void show(){
        System.out.println("我是show方法");
    }
}
class Demo2 extends Demo1{
    public static void main(String[] args) {
        Demo2 demo2=new Demo2();
    }
}

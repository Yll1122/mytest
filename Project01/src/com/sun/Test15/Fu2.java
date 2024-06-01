package com.sun.Test15;
public class Fu2 {
    Fu2(){
        System.out.println("我是父类无参构造方法");
    }
    Fu2(boolean b){
        System.out.println("我是父类有参构造方法");
    }
    public  void show(){
        System.out.println("我是父类的show方法");
    }
    public void print(){
        System.out.println("我是父类的打印方法");
    }
}
class Zi2 extends Fu2{
    Zi2(){
        System.out.println("我是子类构造方法");
    }
    public void show(){
        super.show();
        System.out.println("我是子类中的show方法");
    }
    public void call(){
        this.show();
        super.print();
        System.out.println("我是子类的call方法");
    }

    public static void main(String[] args) {
        Zi2 zi2=new Zi2();
        zi2.show();
        zi2.call();
    }
}

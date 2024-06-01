package com.sun.Test15;

public class Fu1 {
    Fu1(){
        System.out.println("我是Fu类的空参构造方法");
    }
    public  void show(){
        System.out.println("我是父类当中的show方法");
    }
    public void printf(){
        System.out.println("我是父类的打印方法");
    }

}
class Zi1 extends Fu1{
    Zi1(){
        super();
        System.out.println("我是zi类的空参构造方法");
    }
    public void printf(){
        System.out.println("我是子类的打印方法");
    }
    public  void show(){
        this.printf();
        super.printf();
        super.show();//super不能在静态方法里面使用。
        System.out.println("我是子类中的show方法");
    }

    public static void main(String[] args) {
        Zi1 zi=new Zi1();
        zi.show();
    }
}

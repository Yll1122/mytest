package com.sun.Test16;

import com.sun.Test11.C;

//抽象方法所在的类必须定义成抽象类
//抽象类里面可以有其他方法
public abstract class Animal {
    public abstract void run();
    public abstract void eat();
}
abstract class Cat extends Animal{
//如果不能把父类的抽象方法都实现，那么就要把子类定义成抽象类。
    @Override
    public void run() {
        System.out.println("小猫在墙头走");
    }
}
class Cat1 extends Cat{

    @Override
    public void eat() {
        System.out.println("小猫的儿子在吃鱼");
    }
    public static void main(String[] args) {
        Cat1 cat=new Cat1();//抽象类不能被实例化
        cat.eat();
        cat.run();
    }
}

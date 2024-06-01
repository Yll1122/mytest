package com.sun.Test13;

public abstract class Animal {
    public abstract void eat();
}
class Cat extends Animal{

    public void eat(){
        System.out.println("小猫吃鱼");
    }
    public void show(){
        System.out.println("小猫喵喵喵");
    }

}
class Test{
    public static void main(String[] args) {
        Animal c=new Cat();
        c.eat();
    }
}

package com.sun.Test15;

public interface Animal {
    void fly();
}
class Test{
    public static void main(String[] args) {
        Animal animal=new Animal() {
            @Override
            public void fly() {
                System.out.println("小鸟飞");
            }
        };
        flyTest(animal);//传接口匿名类进去，调用Animal方法。
    }
public static void flyTest(Animal animal){
animal.fly();//调用Animal的fly方法
}
}

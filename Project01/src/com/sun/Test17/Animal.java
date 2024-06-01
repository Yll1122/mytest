package com.sun.Test17;

public abstract class Animal {
    public abstract void eat();
}
    class Cat extends Animal {
        @Override
        public void eat() {
            System.out.println("小猫吃鱼");
        }
        public void run(){
            System.out.println("小猫跑步");
        }

    }
    class Dog extends Animal {
        @Override
        public void eat() {
            System.out.println("小狗吃骨头");
        }
    }

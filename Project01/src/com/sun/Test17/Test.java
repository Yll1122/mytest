package com.sun.Test17;

public class Test {
    public static void testEat(Cat cat) {
    }

    public static void main(String[] args) {
        Animal animal=new Cat();
        Cat cat=(Cat) animal;
        cat.run();
    }
}

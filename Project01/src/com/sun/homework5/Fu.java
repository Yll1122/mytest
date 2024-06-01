package com.sun.homework5;

public class Fu {
    static {
        System.out.println(1);
    }
    {
        System.out.println(2);
    }
    Fu()
    {
        System.out.println(3);
    }
}
class Zi extends Fu{
    static {
        System.out.println(4);
    }
    {
        System.out.println(5);
    }
    Zi()
    {
        System.out.println(6);
    }

    public static void main(String[] args) {
        new Zi();
    }
}

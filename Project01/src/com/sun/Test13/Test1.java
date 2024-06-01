package com.sun.Test13;

public class Test1 {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.run();
        USB u=new Mouse();
        laptop.useUSB(u);
        USB k=new Keyboard();
        laptop.useUSB(k);
        laptop.turnOff();
    }
}

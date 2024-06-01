package com.sun.Test13;

public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("绿灯亮，打开");
    }

    @Override
    public void close() {
        System.out.println("绿灯不亮，关闭");
    }
    public void typing(){
        System.out.println("键盘具有敲击功能");
    }
}

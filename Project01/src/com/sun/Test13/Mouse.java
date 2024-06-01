package com.sun.Test13;

public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("红灯亮，打开");
    }

    @Override
    public void close() {
        System.out.println("红灯不亮，关闭");
    }
    public  void click(){
        System.out.println("鼠标具有点击功能");
    }
}

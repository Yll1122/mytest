package com.sun.Test08;

class Fu {
    private int n;

    Fu() {
        System.out.println("Fu()");
    }
    public void show(){
        System.out.println("我是父类");
    }
}

class Zi extends Fu {
//Zi zi=new Zi();
    Zi() {
        super();
        System.out.println("Zi()");
    }
    public void show(){
        System.out.println("我是子类");
    }
    public void test(){
       super.show();
    }
}

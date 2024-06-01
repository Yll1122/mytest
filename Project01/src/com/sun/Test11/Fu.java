package com.sun.Test11;

class Fu {

 public int show(){
     System.out.println("Fu类中的show方法执行");
     return 0;
 }
}

class Zi extends Fu {
    public int show() {
        System.out.println("Zi类中的show2方法执行");
        return 0;
    }
}

class ExtendDemo02 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

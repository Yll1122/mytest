package com.sun.Test11;

public interface LiveAble {
//静态方法和默认方法可以调用私有静态方法
    public default void show1(){//默认方法可以调用私有方法
        print();
        System.out.println(111);
    }
    public static void show4(){//静态方法
        System.out.println(444);
        print1();//私有静态方法
    }
    private void print(){//私有方法
        System.out.println("我是默认方法");
    }
    private static void print1(){//私有静态方法
        System.out.println("我是私有静态方法");
    }
    class A implements LiveAble{
        public  void  show1(){
            LiveAble.super.show1();
            System.out.println(122);
        }

    }

    public static void main(String[] args) {
        A a = new A();
        a.show1();
    }
}

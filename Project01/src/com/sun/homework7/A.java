package com.sun.homework7;

public interface A {
    public abstract void showA();

    private static void show10(String str) {
        System.out.println("static "+str);
        for (int i = 0; i < 10; i++) {
            System.out.print(str + "\t");
        }
    }

    public static void showB10() {
        show10("BBBB");
    }

    public static void showC10() {
        show10("CCCC");
    }

}

class B implements A {
    public void showA() {
        System.out.println("AAAA");
    }

    public static void showD() {
        System.out.println("DDDD");
    }
}

class Test01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println();
        A.showB10();
        System.out.println();
        A.showC10();
        System.out.println();
        b.showA();
        B.showD();

    }
}

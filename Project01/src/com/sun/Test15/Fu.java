package com.sun.Test15;

public class Fu {
    private String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Fu() {
        System.out.println("我是父类无参构造方法");
    }

    public Fu(String name, int age) {
        System.out.println("我是父类有参构造方法");
    }
}
class Zi extends Fu{
    public Zi() {
        System.out.println("我是子类无参构造方法");
    }
    public Zi(String name,int age){
        super("杨玲玲",22);
        System.out.println("我是子类的有参构造方法");
    }

    public static void main(String[] args) {
        Zi zi=new Zi("杨玲玲",22);
        Zi zi1=new Zi();
    }
}

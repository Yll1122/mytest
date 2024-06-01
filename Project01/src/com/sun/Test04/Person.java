package com.sun.Test04;

public class Person {
    String name;
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

    public String eat(){
        return "rice";
    }//成员方法没有static，如果加上static，则不是成员方法。
    public void study(){
        System.out.println(name+"在学习Java!");
    }
/*    public Person(){}
    */
    public Person(String name,int age){//有参构造器，在调用的时候有两种方法，一种是通过set方法赋值，一种是通过直接new的时候就赋值。
        this.name=name;
        this.age=age;
    }
}

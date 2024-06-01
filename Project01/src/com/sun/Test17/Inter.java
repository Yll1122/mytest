package com.sun.Test17;

public interface Inter {
    void shwo();
}
class Student{
    Inter in;
    public  void show2(Inter in){//接口作为参数列表进行传递
        in.shwo();
    }
}
class Test4{
    public static void main(String[] args) {
        Student student=new Student();
        student=null;//给调用的对象赋空指针，会报错空指针异常
       student.show2(new Inter() {
           @Override
           public void shwo() {
               System.out.println("我是show方法");
           }
       });
    }

}

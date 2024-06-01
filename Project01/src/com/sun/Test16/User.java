package com.sun.Test16;

public class User {
    public String username;
}
class UserTest{
    public static void main(String[] args) {
      final User user=new User();
//        user=new User();//user是final修饰的地址值，不能重新赋值
        user.username="杨玲玲";//User里面的属性username是一个变量,可以重新赋值。
        user.username="ylx";
    }
}

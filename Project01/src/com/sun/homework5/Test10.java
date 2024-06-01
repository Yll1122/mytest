package com.sun.homework5;

import java.util.ArrayList;
import java.util.Scanner;

public class Test10 {
    static ArrayList<User> list = new ArrayList<>();

    static {
        User user = new User("jack", "1234");
        user.show();
        User user1 = new User("rose", "5678");
        user1.show();
        list.add(user);
        list.add(user1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        User u = new User(username, password);
        String login = login(u);
        System.out.println("登录结果:" + login);
    }

    public static String login(User user) {
        for (User user1 : list) {
         if(user1.getUsername().equals(user.getUsername())){
             if(user1.getPwd().equals(user.getPwd())){
                 return "登陆成功";
             }else {
                 return "密码错误";
             }
         }
        }
        return "用户名错误";
    }
}

class User {
    private String username;
    private String pwd;

    public User() {
    }

    public User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void show() {
        System.out.println(username + "-" + pwd);
    }
}
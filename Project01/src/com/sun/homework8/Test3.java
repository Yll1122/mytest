package com.sun.homework8;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            users.add(new User(i));
        }
        System.out.println("未分组：");
        System.out.println(users);
        Reception reception=new Reception();
        for (int i = 0; i < 50; i++) {
            reception.recept(users.get(i));
        }
        System.out.println("已分组：");
        System.out.println(users);
    }
}

class Reception {
    public Reception() {
    }

    Filter f;

    public Filter getF() {
        return f;
    }

    public void setF(Filter f) {
        this.f = f;
    }

    public void recept(User u) {
        if (u.getId() >= 10 && u.getId() <= 19) {
            u.setType("v1");
        } else if (u.getId() >= 20 && u.getId() <= 29) {
            u.setType("v2");
        } else {
            u.setType("A");
        }
    }
}

class User {
    public User() {
    }

    private String type;

    private int id;

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id + "-" + type;
    }
}

interface Filter {
    void filterUser(User u);

}
package com.sun.Test17;

public class People {
    class Child {
        public void jump() {
            if (live) {
                System.out.println("心脏在跳动");
            } else {
                System.out.println("心脏不跳了");
            }
        }
    }

    private boolean live = true;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
    class Test5{
    public static void main(String[] args) {
            People people = new People();
            people.setLive(false);
            People.Child child = people.new Child();
            child.jump();
    }
}



package com.sun.Test14;

public class Person {
    private boolean live=true;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    class Heart{
        public void jump(){
            if(live==true){
                System.out.println("心脏在跳动");
            }
            else {
                System.out.println("心脏不跳了");
            }
        }
    }

    public static void main(String[] args) {
        Person person=new Person();
        person.live=false;
        Heart heart=person.new Heart();
        heart.jump();
    }
}

package com.sun.Test14;
//英雄，抽象类
public abstract class Hero {
    private String name;//名字
    private int attack;//攻击力
    private int defense;//防御力
    private int hp;//血量
    private int rehp;//回复血量
    public Hero(String name, int attack, int defense, int hp,int rehp) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.rehp=rehp;
    }

    public Hero() {
    }

    public int getRehp() {
        return rehp;
    }

    public void setRehp(int rehp) {
        this.rehp = rehp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract void q (Hero hero);
    public abstract void w (Hero hero);
    public abstract void e (Hero hero);
    public abstract void r (Hero hero);
}

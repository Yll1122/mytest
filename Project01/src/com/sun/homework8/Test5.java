package com.sun.homework8;

public class Test5 {
    public static void main(String[] args) {
        Player player = new Player();
        player.select("法师");
        System.out.println("====================");
        player.select("战士");
    }
}

class Player {
    public FightAble select(String str) {
        ZhanShi zhanShi = new ZhanShi();
        FaShi faShi = new FaShi();
        FightAble fightAble = new FightAble() {
            @Override
            public void specialFight() {

                if (str == "战士") {
                    System.out.println("选择：武力角色");
                    zhanShi.specialFight();
                    FightAble.super.commonFight();
                }
                if (str == "法师") {
                    System.out.println("选择：法力角色");
                    faShi.specialFight();
                    FightAble.super.commonFight();
                }

            }
        };
        fightAble.specialFight();
        return fightAble;
    }
}

class FaShi implements FightAble {
    @Override
    public void specialFight() {
        System.out.println("法术攻击");
    }
}

class ZhanShi implements FightAble {
    @Override
    public void specialFight() {
        System.out.println("武器攻击");
    }
}

interface FightAble {
    public abstract void specialFight();

    public default void commonFight() {
        System.out.println("普通攻击");
    }
}
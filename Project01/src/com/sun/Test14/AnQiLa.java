package com.sun.Test14;

public class AnQiLa extends Hero{

    @Override
    public void q(Hero hero) {
        this.setAttack(300);
        hero.setDefense(100);
        int i=this.getAttack()- hero.getDefense();
    hero.setHp(hero.getHp()-i);
        System.out.println(this.getName()+"向"+hero.getName()+"发动混沌火球"+hero.getName()+"掉了"+i+"点血");
        System.out.println(hero.getName()+"剩余血量"+hero.getHp());
    }

    @Override
    public void w(Hero hero) {
        this.setRehp(250);
//        hero.setDefense(200);
//        int i=this.getAttack()- hero.getDefense();
        int i=getRehp();
        this.setHp(this.getHp()+i);
//        System.out.println(this.getName()+"向"+hero.getName()+"发动火球术"+hero.getName()+"掉了"+i+"点血");
        System.out.println(this.getName()+"给自己回血+"+getRehp());
        System.out.println(this.getName()+"剩余血量"+this.getHp());
    }

    @Override
    public void e(Hero hero) {
        this.setAttack(600);
        hero.setDefense(300);
        int i=this.getAttack()- hero.getDefense();
        hero.setHp(hero.getHp()-i);
        System.out.println(this.getName()+"向"+hero.getName()+"发动炽热光辉"+hero.getName()+"掉了"+i+"点血");
        System.out.println(hero.getName()+"剩余血量"+hero.getHp());
    }

    @Override
    public void r(Hero hero) {
        this.setAttack(850);
        hero.setDefense(400);
        int i=this.getAttack()- hero.getDefense();
        hero.setHp(hero.getHp()-i);
        System.out.println(this.getName()+"向"+hero.getName()+"发动咒术火焰"+hero.getName()+"掉了"+i+"点血");
        System.out.println(hero.getName()+"剩余血量"+hero.getHp());
    }
}

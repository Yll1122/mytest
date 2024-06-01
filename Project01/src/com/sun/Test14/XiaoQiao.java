package com.sun.Test14;

public class XiaoQiao extends Hero {
    @Override
    public void q(Hero hero) {
        this.setAttack(400);
        hero.setDefense(100);
        int i=this.getAttack()- hero.getDefense();
        hero.setHp(hero.getHp()-i);
        System.out.println(this.getName()+"向"+hero.getName()+"发动绽放之舞"+hero.getName()+"掉了"+i+"点血");
        System.out.println(hero.getName()+"剩余血量"+hero.getHp());
    }

    @Override
    public void w(Hero hero) {
        this.setAttack(300);
        hero.setDefense(200);
        int i=this.getAttack()- hero.getDefense();
        hero.setHp(hero.getHp()-i);
        System.out.println(this.getName()+"向"+hero.getName()+"发动甜蜜恋风"+hero.getName()+"掉了"+i+"点血");
        System.out.println(hero.getName()+"剩余血量"+hero.getHp());
    }

    @Override
    public void e(Hero hero) {
        this.setAttack(500);
        hero.setDefense(300);
        int i=this.getAttack()- hero.getDefense();
        hero.setHp(hero.getHp()-i);
        System.out.println(this.getName()+"向"+hero.getName()+"发动星华缭乱"+hero.getName()+"掉了"+i+"点血");
        System.out.println(hero.getName()+"剩余血量"+hero.getHp());
    }

    @Override
    public void r(Hero hero) {
        this.setAttack(900);
        hero.setDefense(400);
        int i=this.getAttack()- hero.getDefense();
        hero.setHp(hero.getHp()-i);
        System.out.println(this.getName()+"向"+hero.getName()+"发动治愈微笑"+hero.getName()+"掉了"+i+"点血");
        System.out.println(hero.getName()+"剩余血量"+hero.getHp());
    }
}

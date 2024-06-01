package com.sun.Test14;
import java.util.Random;

public class Pk {
    public static void main(String[] args) {
        AnQiLa anQiLa=new AnQiLa();
        anQiLa.setHp(1000);
        anQiLa.setName("安琪拉");
        XiaoQiao xiaoQiao=new XiaoQiao();
        xiaoQiao.setName("小乔");
        xiaoQiao.setHp(1000);
        int i=0;
        while (anQiLa.getHp()>0&&xiaoQiao.getHp()>0){
           if(i%2==0){
               //安琪拉打小乔
               Random random=new Random();
               int able=random.nextInt(4)+1;
               if(able==1){
                anQiLa.r(xiaoQiao);
               } else if (able==2) {
                   anQiLa.e(xiaoQiao);
               } else if (able==3) {
                   anQiLa.q(xiaoQiao);
               }
               else {
                   anQiLa.w(anQiLa);
               }
           }else {
               //小乔打安琪拉
               Random random=new Random();
               int able=random.nextInt(4)+1;
               if(able==1){
                   xiaoQiao.r(anQiLa);
               } else if (able==2) {
                   xiaoQiao.e(anQiLa);
               } else if (able==3) {
                   xiaoQiao.q(anQiLa);
               }
               else {
                   xiaoQiao.w(anQiLa);
               }
           }
           i++;
        }
        if(xiaoQiao.getHp()>0){
            System.out.println(xiaoQiao.getName()+"赢了");
        }
        if(anQiLa.getHp()>0){
            System.out.println(anQiLa.getName()+"赢了");
        }
    }
}

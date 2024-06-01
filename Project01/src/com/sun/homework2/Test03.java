package com.sun.homework2;

import java.text.Format;

public class Test03 {
    public static void main(String[] args) {
        String[] puke=getPuke();
        int num1=1;
        int num2=5;
        int num3=50;
        String[] pk3=get3(puke,num1,num2,num3);
        for (int i = 0; i <3; i++) {

            System.out.println(puke[i]);
        }
    }

    public static String[] get3(String[] puke, int num1, int num2, int num3) {
        puke[0]=puke[num1-1];
        puke[1]=puke[num2-1];
        puke[2]=puke[num3-1];
        return puke;
    }

    public static String[] getPuke() {
        String[] hs = {"黑桃","红桃","梅花","方片"};
        String[] ds = {"A", "2", "3","4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] card=new String[52];
        int index=0;
        for (int i = 0; i < hs.length; i++)
        {
            for (int j = 0; j < ds.length; j++)
            {
             card[index]=hs[i]+ds[j];
             index++;
            }
        }
        return card;
    }
}

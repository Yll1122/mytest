package com.sun.Test09;

public class Test06 {
    public static void main(String[] args) {
        String str="sjiWUIsjIW8281";
        int scount=0;
        int lcount=0;
        int num=0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='a'&&chars[i]<='z'){
                scount++;
            } else if (chars[i]>='A'&&chars[i]<='Z') {
                lcount++;
            }else {
                num++;
            }
        }
        System.out.println("lcount = " + lcount);
        System.out.println("scount = " + scount);
        System.out.println("num = " + num);
    }
}

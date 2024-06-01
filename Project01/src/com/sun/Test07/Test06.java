package com.sun.Test07;
import java.util.Arrays;//Arrays是对数组进行操作的类，因此要把字符传入数组，

public class Test06 {
    public static void main(String[] args) {
        String line="ysKUreaytWTRHsgFdSAoidq";
       char[] str= line.toCharArray();
        Arrays.sort(str);
        for (int i = str.length-1; i>=0; i--) {
            System.out.print(str[i]);
        }
    }


}

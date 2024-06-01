package com.sun.homework2;

public class Test04 {
    public static void main(String[] args) {
        char [] charArray={'a','l','f','m','f','o','b','b','s','n'};
        printCount(charArray);
    }
    public static void printCount(char[] arr1){
        int[] letter=new int[26];
        for (int i = 0; i < arr1.length; i++) {
            int index=arr1[i]-97;
            letter[index]=letter[index]+1;
        }
        for (int i = 0; i < letter.length; i++) {
            if(letter[i]!=0)
            System.out.println((char)(i+97)+"--"+letter[i]);
        }
    }
}

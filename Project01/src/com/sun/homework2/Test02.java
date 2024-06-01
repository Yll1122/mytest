package com.sun.homework2;

public class Test02 {
    public static void main(String[] args) {
        String[] hs={"黑桃","红桃","梅花","方片"};
        String[] ds = {"A","2","3","4", "5","6","7","8","9","10","J","Q","K"};
        printCard(hs,ds);
    }

    private static void printCard(String[] hs, String[] ds) {
        for (int i = 0; i < hs.length; i++) {
            for (int j = 0; j < ds.length; j++) {
                System.out.print(hs[i]+ds[j]+" ");
            }
            System.out.println();
        }

    }

}

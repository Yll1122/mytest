package com.sun.homework5;

import java.util.Scanner;

public class Test3 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("请输入大字符串:");
		        String big = sc.nextLine();
		        System.out.print("请输入小字符串:");
		        String small = sc.nextLine();
		        int count = getCount(big, small);
		        System.out.println("小字符串" + small + ",在大字符串中共出现" + count + "次");
		    }
		    public static int getCount(String big, String small) {
			int count=0;
			int i=big.indexOf(small);
			while (i!=-1){
				i=big.indexOf(small,i+1);
				count++;
			}
		    return count;
		    }
		}
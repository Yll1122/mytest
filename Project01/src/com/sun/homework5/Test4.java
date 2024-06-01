package com.sun.homework5;

import java.util.Scanner;

public class Test4 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("请输入源字符串:");
		        String srcStr = sc.nextLine();
		        System.out.print("请输入要删除的字符串:");
		        String delStr = sc.nextLine();
		        printCount(srcStr, delStr);
		    }
		    private static void printCount(String srcStr, String delStr) {
		        int count=0;
				int i=srcStr.indexOf(delStr);
				String src=srcStr.replaceAll(delStr,"");
				while (i!=-1){
					i=srcStr.indexOf(delStr,i+1);
					count++;
				}
				System.out.println("源字符串中总共包含："+count+"个"+delStr);
				System.out.println("删除"+delStr+"后的字符串为："+src);
		    }
		}
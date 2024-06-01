package com.sun.homework5;

import java.util.Scanner;

public class Test2 {
		    public static void main(String[] args) {
		        //1.键盘输入一个qq号码字符串
		        Scanner sc = new Scanner(System.in);
		        String qq = sc.next();
		        //2.调用checkQQ (String qq)方法内实现验证。
		        boolean isOK = checkQQ(qq);
		        //3.打印验证的结果
		        System.out.println("这个QQ号码是否正确:" + isOK);
		    }
		    public static boolean checkQQ(String qq){
				if(!qq.startsWith("0",0)&&qq.length()>=5&&qq.length()<=12){//startsWith判断字符串从某索引开始是否以指定的子字符串开始。
					return true;
				}
		       return false;
		    }
		}
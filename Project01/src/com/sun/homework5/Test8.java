package com.sun.homework5;

import java.util.Scanner;

public class Test8 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int a = scanner.nextInt();
		        String next = scanner.next();
		        int b = scanner.nextInt();
		        String count = count(a, next, b);
		        System.out.println(a +next +b +"="+count);
		    }
		
		    public static String count(int a, String op , int b ){
		      switch (op){
				  case "+":
					  return Integer.toString(a+b);//Integer是int的封装类，可以调用方法把int型转换成String型
				  case "-":
					  return Integer.toString(a-b);

				  case "*":
					  return Integer.toString(a*b);

				  case "/":
					  if(b==0){
						  break;
					  }
					  return Integer.toString(a/b);

				  case "%":
					  if(b==0){
						  break;
					  }
					  return Integer.toString(a%b);
			  }
			  return null;
		    }
		}
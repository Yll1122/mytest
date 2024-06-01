package com.sun.homework5;

import java.io.Reader;

public class Test9 {
		    public static void main(String[] args) {
		        String s = "9887YW23";
		        System.out.println(s+" 密码是否合法:"+isV(s));
		    }
		
		    public static boolean  isV(String pwd) {
				int count = 0;
				boolean b = true;
				char[] arr = pwd.toCharArray();
				for (char c : arr) {
					if(Character.isUpperCase(c))
					{
						count++;
					}
					if (!Character.isLetterOrDigit(c))
						b = false;
				}
				if (pwd.length() >= 8 && count >= 2 && b)
					return true;
				return false;
			}
		}
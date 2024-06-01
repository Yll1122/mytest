package com.sun.homework5;
import java.util.ArrayList;

public class Test6 {
	    public static void main(String[] args) {
	        ArrayList<String> list = getArrayList();
	        System.out.println("源字符串:");
	        System.out.println(list);
	        //删除集合中长度大于5的元素
	        delStrsFromList01(list);
	        System.out.println("删除后:");
	        System.out.println(list);
	    }
	
	    //返回存储多个字符串的ArrayList集合
	    private static ArrayList<String> getArrayList() {//ArrayList是大小可变的数组，
			ArrayList<String> list=new ArrayList<>();
			list.add("你好啊，大笨蛋");
			list.add("jsjsj");
			list.add("ijjs");
			return list;
	    }
	
	    //删除list集合中所有长度>5的字符串
	    private static void delStrsFromList01(ArrayList<String> list) {
			for (int i = 0; i < list.size(); i++) {
				String s=list.get(i);//获取每一个下标的值转成单个字符串，判断字符串的长度，如果大于5，就删除。
				if(s.length()>5){
					list.remove(s);
				}
			}
	    }
	}

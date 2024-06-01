package com.sun.homework4;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Random;

public class Test4 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = getNumList();
		//  统计字符数组中字母出现次数
		printCount(numList);
	}
	public static void printCount(ArrayList<Integer> list) {
		int[] count=new int[10];
		for (int i = 0; i < list.size(); i++) {
			count[list.get(i)-1]++;
		}
		for (int i=0;i< count.length;i++) {
			System.out.println("数字："+(i+1)+"--"+count[i]+"次");
		}
	}
	public static ArrayList<Integer> getNumList() {
		ArrayList<Integer> arrayList=new ArrayList<>();
		Random random=new Random();
		for (int i = 0; i < 100; i++) {
			arrayList.add(random.nextInt(10)+1);
		}
		return arrayList;
	}

	}
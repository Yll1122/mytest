package com.sun.homework4;

import java.util.ArrayList;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        // 获取随机分数
        ArrayList<Integer> scoreList = getScoreList();
        for (Integer integer : scoreList) {
            System.out.println(integer);
        }
        // 定义计数的变量
        ArrayList<Integer> countList = countScore(scoreList);
        System.out.println("----------------");
        // 打印统计结果
        printCount(countList);
    }

    private static void printCount(ArrayList<Integer> countList) {
        System.out.println("100分--80分:" + countList.get(0)+"人");
        System.out.println("79分--60分:" + countList.get(1)+"人");
        System.out.println("59分--40分:" + countList.get(2)+"人");
        System.out.println("39分--0分:" + countList.get(3)+"人");
    }

    public static ArrayList<Integer> countScore(ArrayList<Integer> scoreList) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s4 = 0;
        for (int i=0;i<scoreList.size();i++) {
            if (scoreList.get(i)>= 80&&scoreList.get(i)<=100) {
                s1++;
            }
            else if (scoreList.get(i) >= 60&&scoreList.get(i)<=79) {
                s2++;
            } else if (scoreList.get(i) >= 40&&scoreList.get(i)<=59) {
                s3++;
            } else {
                s4++;
            }
        }
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        return arrayList;
    }


    public static ArrayList<Integer> getScoreList() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(101));
        }
        return arrayList;
    }
}
package com.sun.homework8;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Test1 {

      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
         String str=scanner.next();
          HandleAble handleAble=new HandleAble() {
              @Override
              public String handleString(String str) {
                  System.out.println("原数字:"+str);
                  BigDecimal bigDecimal=new BigDecimal(str);
                  BigDecimal bigDecimal1 = bigDecimal.setScale(0, RoundingMode.HALF_UP);
                  BigDecimal bigDecimal2=bigDecimal.setScale(4,RoundingMode.HALF_UP);
                  System.out.println("取整后:"+bigDecimal1 );
                  System.out.println("保留四位小数后：" + bigDecimal2);
                  return str;
              }
          };
          handleAble.handleString(str);
      }
  }
  interface HandleAble {
    String handleString(String str);
  }

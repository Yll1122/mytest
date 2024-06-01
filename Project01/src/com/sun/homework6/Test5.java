package com.sun.homework6;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        // 创建SUV对象
        SUV suv1 = new SUV(5079, 750000);
        SUV suv2 = new SUV(4813, 760000);
        SUV suv3 = new SUV(4270, 127800);
        SUV suv4 = new SUV(4545, 188800);

        //添加到集合中
        ArrayList<SUV> list = new ArrayList<>();
        list.add(suv1);
        list.add(suv2);
        list.add(suv3);
        list.add(suv4);

        // 遍历集合,查询中型SUV
        for (int i = 0; i < list.size(); i++) {
            SUV suv = list.get(i);
            if (suv.midSUV()) {
                suv.showMsg();
            }
        }

    }

}

// 定义汽车类
class Auto {
    private String brand;
    private float price;
    private float length;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public Auto(String brand, float length, float price) {
        this.brand = brand;
        this.price = price;
        this.length = length;
    }

    public Auto() {
    }
}

// 定义SUV类
class SUV extends Auto {
    int slength = 4295;
    int mlength = 5070;

    public SUV(float length, float price) {
        super("SUV",length,price);
    }

    public SUV() {
    }

    public boolean midSUV() {
      if(getLength()>slength&&getLength()<=mlength)
        return true;
      return false;
    }

    public void showMsg() {
        System.out.println("车型:" + getBrand());
        System.out.println("\t价格:" + getPrice());
        System.out.println("\t车长:" + getLength());
    }
}
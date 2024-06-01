package com.sun.homework8;

public class Test4 {
    public static void main(String[] args) {
		Worker worker=new Worker();
        Com com=new Com();
		Apple apple1=new Apple(5,"青色");
		Apple apple2=new Apple(3,"红色");
        System.out.println("默认挑大的：");
        System.out.println(com.compare(apple1, apple2));
        worker.pickApple(com,apple1,apple2);
    }

}

class Worker {
    public Apple pickApple(CompareAble c, Apple a1, Apple a2) {
        Apple apple=new Apple();
        Com com=new Com();
        com.compare(true,a1,a2);
      return apple;
    }

}

class Apple {
    double size;
    String color;

    public Apple(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public Apple() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size + "-" + color;
    }
}

interface CompareAble {
	public default Apple compare(Apple a1, Apple a2) {
       return a1.getSize()>a2.getSize()?a1:a2;
	}
}

class Com implements CompareAble {
	public  Apple compare( boolean b,Apple a1, Apple a2) {
        CompareAble.super.compare(a1,a2);
        if(b==true)
        {
            System.out.println("挑红的：");
            System.out.println(a2);
            return a1;
        }
          else {
            System.out.println("挑青的：");
            System.out.println(a1);
        }
          return a2;
    }
}
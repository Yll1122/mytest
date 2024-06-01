package com.sun.homework7;

public interface Universe {
     void doAnything();//抽象方法
     double PI=3.14;
     default void show1(){
         System.out.println("我是show1方法");
         print();
     }
      static void show(){
          System.out.println("我是show方法");
          print();
     }
private static void print(){
    System.out.println("我是打印方法");
}
}
class Star{
   public  void shine(){
       System.out.println("star:星星一闪一闪亮晶晶");//成员方法
   }
}
class Sun extends Star implements Universe{
    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }
    public void shine(){
        System.out.println("sun:光照八分钟，到达地球");
    }
    public void show1(){
        System.out.println("我是show1方法");
    }

}
class Test{
    public static void main(String[] args) {
        Star star=new Star();
        star.shine();
        System.out.println("=======================");
        Universe u=new Sun();
        u.doAnything();
        if(u instanceof Sun){
            Sun sun = (Sun)u;
            sun.shine();
        }
    }
}

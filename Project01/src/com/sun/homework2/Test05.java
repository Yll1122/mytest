package com.sun.homework2;

public class Test05 {
    public static void main(String[] args) {
      int [] arr=  {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
     int[] arr1=getAvg((arr));
            System.out.println("高于平均分:"+arr1[0]+"的个数有"+arr1[1]+"个");
    }
    public static int[] getAvg(int[] arr){
        int sum=0;
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        int avg=sum/arr.length;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>avg)
            {
                num++;
            }
        }
        int[] orange={avg,num};
        return orange;
    }
}

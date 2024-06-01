package com.sun.homework4;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String s = VerifyCode();
            System.out.println("随机验证码：" + s);
        }
    }

    private static String VerifyCode() {
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] arr1 = new char[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int s=random.nextInt(arr.length);
            arr1[i]=arr[s];
        }
        return new String(arr1);
    }
}

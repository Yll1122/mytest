package com.sun.Test11;
class Phone {
    public void sendMessage() {
        System.out.println("发短信");
    }
    public void call() {
        System.out.println("打电话");
    }
    public void showNum() {
        System.out.println("来电显示号码");
    }
}
class NewPhone extends Phone {
    public void showNum() {
        super.showNum();
        System.out.println("显示来电姓名");
        System.out.println("显示头像");
    }
}
public class ExtendsDemo06 {
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.call();
        np.showNum();
    }
}

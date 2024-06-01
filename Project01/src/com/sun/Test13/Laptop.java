package com.sun.Test13;

public class Laptop{
public void run(){
    System.out.println("笔记本运行");
}
public void useUSB(USB usb){
    if(usb!=null){
        usb.open();
        if(usb instanceof Mouse){
            Mouse m=(Mouse)usb;
            m.click();
        } else if (usb instanceof Keyboard) {
            Keyboard k=(Keyboard) usb;
            k.typing();
        }
        usb.close();
    }
}
public void turnOff(){
    System.out.println("笔记本关闭");
}

}

package com.sun.Test09;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class Demo2 {

    public static void main(String[] args) throws IOException {
        URL u = new URL("http://www.hbpu.edu.cn/");
        URLConnection urlConnection = u.openConnection();//打开网站的连接
        //得到一个输入字节流对象 : inputStream
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //bufferedReader是一个缓冲字符流,因为网页中都是字符,所以使用此流对象
        //---------------------------------------------------------------------

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++
        String line = null;
        StringBuilder builder = new StringBuilder();
        while( (line = bufferedReader.readLine()) != null ){
             builder.append(line+"\n");
        }
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++
        String str = builder.toString();
       // System.out.println("str = " + str);
        String[] split = str.split(" href=\"");
        for (String s : split) {
            int index = s.indexOf("\"");
                if(index>2){
                  s = s.substring(0, index);
                    System.out.println("s = " + s);
                }
        }
//        //将截取的图片地址保存到list集合中
//        String[] split = str.split("img src=\"");
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 1 ; i < split.length ; i++) {
//            int index = split[i].indexOf("\"");
//            String s = split[i].substring(0, index);
//            list.add(s);
//        }
//        //---------------------------------------------------
//
//        dowimg(list);
//    }
//
//    public static void dowimg( ArrayList<String> list ) throws IOException {
//        for (String s : list) {
//            URL u = new URL("https://www.qdnpt.edu.cn/"+s);
//            URLConnection urlConnection = u.openConnection();//打开网站的连接
//            //得到一个输入字节流对象 : inputStream
//            InputStream in = urlConnection.getInputStream();
//
//            int len = 0 ;
//            byte [] buff = new byte[1024];
//            //  images/1122.png
//             int index = s.lastIndexOf("/");
//            String fileName = s.substring(index+1);
//
//            FileOutputStream out = new FileOutputStream("a:/myimg/"+fileName);
//            while ( (len = in.read(buff)) != -1 ){
//                out.write(buff,0,len);
//            }
//            out.close();
//            in.close();
//        }
    }
}

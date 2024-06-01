package com.sun.Test06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test04 {

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
//        System.out.println( str);
        String[] s=str.split("href=");
        for (int i = 0; i < s.length; i++) {
            int ss=s[i].indexOf("\"",1);
            System.out.println(s[i].substring(1,ss));
        }
    }

}


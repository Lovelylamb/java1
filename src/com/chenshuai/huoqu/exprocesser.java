package com.chenshuai.huoqu;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


/*
* 从txt中获取特定数据；（之前用于提取nba小程序中有个接口返回的token和phoneNumber值；）
* */
public class exprocesser {
    public static void main(String[] args) {
        // File file = new File("C:\\Users\\shuai.chen\\Desktop\\新建文本文档.txt");
        File file =new File("C:\\Users\\shuai.chen\\Desktop\\项目\\ASSC WMPT\\new 10.txt");
       // System.out.println("文件大小"+file.length());
        readText(file);
//        long time =System.currentTimeMillis();
//        String DateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time));
//        System.out.println(time+" "+DateTime);
    }
    //读取文档中的内容
    public static void readText(File file){
        InputStreamReader isr ;
        BufferedReader br =null;
        try {
             isr = new InputStreamReader(new FileInputStream(file),"GBK");
             br = new BufferedReader(isr);
             String lineTxt = null;
             while((lineTxt = br.readLine()) != null){
                   if(lineTxt.startsWith("{") && lineTxt.endsWith("}")){  //如果是{}这个json格式的就获取
//                  System.out.println(lineTxt);   //打印整个字符串
                    JSONObject jsonObject = JSON.parseObject(lineTxt);  //将获取到的string对象转为json对象
                    //System.out.println(jsonObject.getJSONObject("data").getString("phoneNumber")); //打印json对象中data对象中的phoneNumber
                       if(jsonObject.containsKey("data")){
                           JSONObject jsonObject1 = jsonObject.getJSONObject("data");
                           if(jsonObject1 !=null && jsonObject1.containsKey("phoneNumber")  && jsonObject1.containsKey("token")){
                              // System.out.println(jsonObject1);    //打印data的jsonObject
                               String phoneNumber = jsonObject.getJSONObject("data").getString("phoneNumber");
                               String token = jsonObject.getJSONObject("data").getString("token");
                               if(phoneNumber != null && token != null    )
                                   System.out.println(phoneNumber+" "+token);    //打印phoneNumber和token
                           }
                       }
                    }
             }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.chenshuai.huoqu;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;


/*
* 从txt中获取特定数据；（之前用于提取epson小程序中有个接口返回的nickName和taskId；）
* */
public class ExtractTaskid {
    public static void main(String[] args) {
        File file =new File("C:\\Users\\shuai.chen\\Desktop\\taskid.txt");
      //  File file =new File("C:\\Users\\shuai.chen\\Desktop\\taskidBackup.txt");
        readText(file);
    }
    //读取文档中的内容
    public static void readText(File file){
        InputStreamReader isr ;
        BufferedReader br =null;
        try {
             isr = new InputStreamReader(new FileInputStream(file),"UTF-8");
             br = new BufferedReader(isr);
             String lineTxt = null;
             while((lineTxt = br.readLine()) != null){
                   if(lineTxt.startsWith("{") && lineTxt.endsWith("}")){  //如果是{}这个json格式的就获取
//                   System.out.println(lineTxt);   //打印整个字符串
                    JSONObject jsonObject = JSON.parseObject(lineTxt);  //将获取到的string对象转为json对象
                    //System.out.println(jsonObject.getJSONObject("data").getString("phoneNumber")); //打印json对象中data对象中的phoneNumber
//                       if(jsonObject.containsKey("nickName")){
//                           JSONObject jsonObject1 = jsonObject.getJSONObject("nickName");
//                           if(jsonObject1 !=null && jsonObject1.containsKey("phoneNumber")  && jsonObject1.containsKey("token")){
//                              // System.out.println(jsonObject1);    //打印data的jsonObject
//                               String phoneNumber = jsonObject.getJSONObject("data").getString("phoneNumber");
//                               String token = jsonObject.getJSONObject("data").getString("token");
//                               if(phoneNumber != null && token != null    )
//                                   System.out.println(phoneNumber+" "+token);    //打印phoneNumber和token
//                           }
//                       }
                           System.out.println(jsonObject);
                           if(jsonObject.containsKey("rows"))
                           {
                               JSONArray jsonArray = jsonObject.getJSONArray("rows");
                                if(jsonArray!=null )
                               {
                                   System.out.println(jsonArray);
                                   for(int i=0;i<jsonArray.size();i++)
                                   {
                                       JSONObject jsonArrayToObject = (JSONObject) jsonArray.get(i);
                                       String nickName = jsonArrayToObject.getString("nickName");
                                       String taskId = jsonArrayToObject.getString("taskId");
                                       System.out.println(nickName+" "+taskId);
                                   }
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

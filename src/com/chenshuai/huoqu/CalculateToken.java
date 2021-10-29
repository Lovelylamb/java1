package com.chenshuai.huoqu;

import com.alibaba.fastjson.JSON;
import org.apache.commons.codec.binary.Base64;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.*;

public class CalculateToken {

    public static void main(String[] args) throws IOException {
         //String rankey =String.format("%06d",random.nextInt(999999));   数字随机字符
         //6位随机字符
          String str ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";//随机字符从这里获取
          String a[] = str.split("");
          String rankey ="";
          List<String> list = new ArrayList<String>();
          for(int i=0;i<str.length();i++)
          {
              list.add(a[i]);
          }

          Random random =new Random();
          for(int i=0;i<6;i++)
          {
              int num = random.nextInt(list.size());
              rankey+=list.get(num);
          }

          Workbook wb=null;
          Sheet sheet =null;
          Row row =null;
          String cellData =null;
          String SessionIdString=null;
          String SessionKeyString=null;

          String path ="C://Users//shuai.chen//Desktop//token.xls";  //文件路径
          wb= new HSSFWorkbook(new FileInputStream(path));   //读取excel文件
          if(wb!=null)
          {
              sheet =wb.getSheetAt(0);  //获取excel的第一张表
              int rownum = sheet.getPhysicalNumberOfRows();//获取最大行数
              row = sheet.getRow(0);//获取第一行
              int colnum = row.getPhysicalNumberOfCells();//获取最大列数

              System.out.println(rownum +" "+colnum);
              int num=1;
              //循环行
              for(int i=1;i<rownum;i++)
              {
                  row =sheet.getRow(i);
                  if(row !=null)
                  {
                      //循环列
                      for(int j=0;j<colnum;j++)
                      {
                          //cellData = (String) getCellFormatValue(row.getCell(j));

                          if(j==0)
                          {
                              SessionIdString = row.getCell(j).getStringCellValue();
                          }else if(j==1)
                          {
                              SessionKeyString = row.getCell(j).getStringCellValue();
                          }
                      }
                      //时间戳（毫秒单位）
                     // Long requestTime = new Date().getTime();     //1616654290092
                      Long requestTime = System.currentTimeMillis();
                      String sessionId = SessionIdString;  //"79bd21846445484da2d47c3480d8c2c8"
                      String sessionKey = SessionKeyString; //"282d0ad033334a7ea2ab8498a0f146c7"
                      String tokenId = null;
                      //tokenId计算
                      try {
                          tokenId = rankey +  encryptToMd5(rankey + sessionId + sessionKey + requestTime);   //这里涉及到md5加密
                      } catch (UnsupportedEncodingException e) {
                          e.printStackTrace();
                      }
                      Tok tok=new Tok();
                      tok.setRequestTime(requestTime);      //requestTime
                      tok.setSessionId(sessionId);          //sessionId
                      tok.setTokenId(tokenId);              //tokenId
                      String JSONStringify = JSON.toJSONString(tok);  //Object对象转化为json对象
                      // System.out.println(JSONStringify);
                      //  Base64 加密方式
                      String token = getBase64codec(JSONStringify);
                      if(token.endsWith("=="))
                      {
                          System.out.println(num+"  "+token);
                      }
                      num++;

                  }

              }

          }


           //时间戳（毫秒单位）
/*         Long requestTime = new Date().getTime();     //1616654290092
         String sessionId =  "bb2f4a05093a4ef194993fe367f7face";
         String sessionKey = "52449dbff5b94a83bbc89c12b0b973f7";
         String tokenId = null;
        //tokenId计算
        try {
             tokenId = rankey +  encryptToMd5(rankey + sessionId + sessionKey + requestTime);   //这里涉及到md5加密
          } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
          Tok tok=new Tok();
          tok.setRequestTime(requestTime);      //requestTime
          tok.setSessionId(sessionId);          //sessionId
          tok.setTokenId(tokenId);              //tokenId
          String JSONStringify = JSON.toJSONString(tok);  //Object对象转化为json对象
         // System.out.println(JSONStringify);
         //  Base64 加密方式
          String token = getBase64codec(JSONStringify);
          System.out.println(token);*/
    }

   //md5加密
    public static String encryptToMd5(String str) throws UnsupportedEncodingException {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            // 计算md5函数
            messageDigest.update(str.getBytes());
            /* digest()最后确定返回md5 hash值，返回值为8位字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
             * BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
             * 一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方）
             * */
            return new BigInteger(1,messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("没有这个md5算法！");
            //e.printStackTrace();
        }
    }

    //64位加密
    public static String getBase64codec(String str) {
        byte[] b  =null;
        String s = null;
        try {
            b = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(b!=null) {
            //s = new BASE64Encoder().encode(b);
            s =new Base64().encodeBase64String(b);
        }
        return s;
    }
}

//Tok对象类
class Tok
{
    Long requestTime;
    String sessionId;
    String tokenId;

    public Long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
}
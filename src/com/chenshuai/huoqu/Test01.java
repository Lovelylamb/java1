package com.chenshuai.huoqu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
    public static void main(String args[]){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        System.out.println("时间戳Date="+date.getTime());
        Calendar cal=Calendar.getInstance();
        System.out.println("时间戳Calendar="+cal.getTimeInMillis());
        System.out.println("时间戳System="+System.currentTimeMillis());
    }
}

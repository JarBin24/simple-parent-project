package com.jarbin.cloud.demo;

import java.io.File;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestJava {

    public static void main2(String[] args) {
        int pageSize = 500;
        Integer total = null;
        int pageNo = 1;
        Integer value = total - pageSize;
        while(total > pageSize){
            System.out.println(pageNo);
            pageNo ++;
        }
        System.out.println("false");
    }

    public static void main3(String[] args){
        String[] name = {"7.02m","5.66m", "5.42m", "4.59m", "3.96m", "1.52m"};
        String foot = ".jpg";
        try{
            for(int i=0;i<name.length;i++){
                /*Thumbnails.of("D://images/old/"+name[i]+foot)
                        .scale(0.3f)
                        .outputQuality(0.7f)
                        .outputFormat("jpg")
                        .toFile("D://images/new/"+name[i]);*/
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main4(String[] args){
        String name = "7.02m";
        String foot = ".jpg";
        try{
            System.out.println(TestJava.class.getClassLoader().getResource(""));
            /*File file = new File("resource/"+name);
                Thumbnails.of("D://images/old/"+name+foot)
                        .scale(0.5f)
                        .outputQuality(0.7f)
                        .outputFormat("jpg")
                        .toFile(file);*/
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main5(String[] args){

        try{
            File f = new File("D://match/paper/case");
            if(!f.exists()){
                f.mkdirs();
            }
            System.out.println("6666");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main6(String[] args){

        SecureRandom random = new SecureRandom();

        for(int i=0;i<10;i++){
           int j = random.nextInt(0);
           System.out.print(j+",");
        }
    }

    public static void main7(String[] args){

        char c1 = '严';
        char c2='\u4E25';
        char c3 = 65535;
        byte b = (byte)529;
        System.out.println(b);
    }

    public static void main8(String[] args){

        Map a = new HashMap();

        int l = tableSizeFor(5);
        System.out.println(l);
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= Integer.MAX_VALUE) ? Integer.MAX_VALUE : n + 1;
    }

    public static void main(String[] args){

        String date1 = "2019-10-28 10:06:00";
        String date2 = "2019-10-28 10:08:00";

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            Date time1 = df.parse(date1);
            Date time2 = df.parse(date2);
            System.out.println("time1:"+time1.getTime());
            System.out.println("time2:"+time2.getTime());
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

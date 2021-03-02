package com.jarbin.cloud.demo.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HtmlController {

    @RequestMapping("/encode")
    public String encode(){
        System.out.println(1111);
        return "encode";
    }
    @RequestMapping("/read")
    @ResponseBody
    public String read() {
        List<String> accountArrays = new ArrayList<String>();
        List<String> passwordArrays = new ArrayList<String>();

        /* 读取数据 */
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:/account/2018_account_original.txt")),
                    "UTF-8"));
            String lineTxt = null;
            //数据以逗号分隔
            while ((lineTxt = br.readLine()) != null) {
                String[] names = lineTxt.split(",");
                accountArrays.add(names[0]);
                passwordArrays.add(names[1]);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("read errors :" + e);
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("accountArrays", accountArrays);
        map.put("passwordArrays", passwordArrays);
        return JSON.toJSONString(map);
    }
    @RequestMapping("/write")
    @ResponseBody
    public String write(String content) {
        /* 输出数据 */
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:/account/2018_account_encode.txt")),
                    "UTF-8"));
            bw.write(content);
            bw.close();
        } catch (Exception e) {
            System.err.println("write errors :" + e);
        }
        return "success";
    }
}

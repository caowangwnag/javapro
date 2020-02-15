package com.LX.lianxi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("001","张三");
        map.put("002","李四");
        Set<String> keys = map.keySet();
        for (String key:keys){
            System.out.println(map.get(key));
        }
    }
}

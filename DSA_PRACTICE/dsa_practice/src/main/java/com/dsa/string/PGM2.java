package com.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class PGM2 {
    public static void main(String[] args) {
        String name="SANKETSANKET";
        reverse(name);
    }

    private static void reverse(String name){

        Map<String,Integer> hMap=new HashMap<>();
        for(int i=name.length()-1;i>=0;i--){
            if(hMap.containsKey(String.valueOf(name.charAt(i)))){
                hMap.put(String.valueOf(name.charAt(i)), hMap.get(String.valueOf(name.charAt(i)))+1);
            }else {
                hMap.put(String.valueOf(name.charAt(i)),1);
            }
        }
        hMap.forEach((key,value)->{if(value>1)
        {
            System.out.println(key+":"+value);
        }
        });

    }
}

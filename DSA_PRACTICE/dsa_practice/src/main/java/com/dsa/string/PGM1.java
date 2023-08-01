package com.dsa.string;

public class PGM1 {
    public static void main(String[] args) {
        String name="SANKET";
        System.out.println(reverse(name));
    }

    private static String reverse(String name){
        String ans="";
        for(int i=name.length()-1;i>=0;i--){
            ans=ans+name.charAt(i);
        }
        return ans;
    }
}

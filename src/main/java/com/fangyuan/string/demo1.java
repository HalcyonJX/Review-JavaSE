package com.fangyuan.string;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        String s1 = "helloworld";
//        System.out.println(s1.length());
        String subS1 = s1.substring(0,5);
        System.out.println(subS1);
        String[] s2 = s1.split("ow");
        System.out.println(Arrays.toString(s2));

        String string = "Hello World";
        char[] chars = string.toCharArray();
        System.out.println(Arrays.toString(chars));
        String s = new String(chars);
        System.out.println(s);
    }
}

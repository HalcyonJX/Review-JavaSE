package com.fangyuan.string;

public class demo2 {
    public static void main(String[] args) {
        String s1 = "学习";
        String s2 = "Java,";
        String s3 = "狠狠";
        String s4 = "赚一笔";
        StringBuilder builder = new StringBuilder();
        builder.append(s1).append(s2).append(s3).append(s4);
        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder("AAAABBB");
        builder1.delete(0,3);
        System.out.println(builder1);
    }
}

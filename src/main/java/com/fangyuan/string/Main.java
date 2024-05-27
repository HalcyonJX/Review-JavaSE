package com.fangyuan.string;

public class Main {
    public static void main(String[] args) {
//        String s1 = "Hello World";
//        String s2 = "Hello World";
//        System.out.println(s1 == s2); //true
        String s1 = new String("HelloWorld");
        String s2 = new String("HelloWorld");
//        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true
    }
}

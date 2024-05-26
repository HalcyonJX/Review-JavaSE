package com.fangyuan.object.demo13;

public class Main {
    public static void main(String[] args) {
        Student student = new Student() {   //在new的时候，后面加上花括号，把未实现的方法实现了
            @Override
            public void test() {
                System.out.println("我是匿名内部类的实现!");
            }
        };
        student.test();
    }
}

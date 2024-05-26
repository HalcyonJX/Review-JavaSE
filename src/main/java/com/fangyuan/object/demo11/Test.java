package com.fangyuan.object.demo11;

public class Test {
    private final String name;

    public Test(String name){
        this.name = name;
    }

    public static class Inner {
        public void test(){
            System.out.println("我是静态内部类！");
        }
    }
}
package com.fangyuan.object.demo12;

public class Test {
    public void hello(){
        class Inner{   //局部内部类跟局部变量一样，先声明后使用
            public void test(){
                System.out.println("我是局部内部类");
            }
        }

        Inner inner = new Inner();   //局部内部类直接使用类名就行
        inner.test();
    }
}
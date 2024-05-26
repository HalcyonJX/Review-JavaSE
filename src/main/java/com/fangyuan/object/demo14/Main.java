package com.fangyuan.object.demo14;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            Object object = null;
            object.toString();
        } catch (NullPointerException e){
            e.printStackTrace();   //打印栈追踪信息
            System.out.println("异常错误信息："+e.getMessage());   //获取异常的错误信息
        }
        System.out.println("程序继续正常运行！");
    }
    public static int test(int a,int b){
        if(b == 0)
            throw new RuntimeException("被除数不能为0");
        return a/b;
    }
    public static int test1() throws Exception {
        throw new Exception("我是编译时异常");
    }
    private static void test2(int a) throws FileNotFoundException, ClassNotFoundException {  //多个异常使用逗号隔开
        if(a == 1)
            throw new FileNotFoundException();
        else
            throw new ClassNotFoundException();
    }
}

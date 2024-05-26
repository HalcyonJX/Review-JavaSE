package com.fangyuan.object.demo7;

public class Main {
    public static void main(String[] args) {
        Integer i = 10;    //将int类型值作为包装类型使用
        //等价写法
        Integer a = Integer.valueOf(10);

        int z = i;
        //等价写法
        int b = a.intValue();

        Integer x = 128, y = 128;
        System.out.println(x == y);

        //字符串转Integer
        Integer m = Integer.valueOf("555");
        Integer n = Integer.parseInt("666");
        System.out.println(m + " " + n);

        //解码16进制
        Integer v = Integer.decode("0x4f5da2");
        System.out.println(v);

        //10进制转其他进制
        System.out.println(Integer.toHexString(5201314));
    }
}

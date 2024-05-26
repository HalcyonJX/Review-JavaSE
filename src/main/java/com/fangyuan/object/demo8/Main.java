package com.fangyuan.object.demo8;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        //BigInteger的使用
        BigInteger i = BigInteger.valueOf(Long.MAX_VALUE);
        //乘法
        i = i.multiply(BigInteger.valueOf(Long.MAX_VALUE));
        //乘方
        i = i.pow(100);

        //BigDecimal使用
        BigDecimal a = BigDecimal.valueOf(10);
        a = a.divide(BigDecimal.valueOf(3), 100, RoundingMode.CEILING);
        //计算10/3的结果，精确到小数点后100位
        //RoundingMode是舍入模式，就是精确到最后一位时，该怎么处理，这里CEILING表示向上取整
        System.out.println(a);
    }
}

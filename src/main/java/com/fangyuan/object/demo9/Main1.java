package com.fangyuan.object.demo9;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        //Math也是java.lang包下的类，默认可以直接使用

        //计算5的3次方
        Math.pow(5,3);
        //绝对值
        Math.abs(-199);
        //取最大值
        Math.max(20,390);
        //取最小值
        Math.min(10,23);
        //算术平方根
        Math.sqrt(9);

        //三角函数
        //正弦
        Math.sin(Math.PI / 2);
        //余弦
        Math.cos(Math.PI);
        //正切
        Math.tan(Math.PI / 4);
        Math.asin(1);
        Math.acos(1);
        Math.atan(0);

        //对数
        //e为底
        Math.log(Math.E);
        //10为底
        Math.log10(100);
        //利用换底公式，我们可以弄出来任何我们想求的对数函数
        double a = Math.log(4) / Math.log(2);   //这里是求以2为底4的对数，log(2)4 = ln4 / ln2

        //向上取整
        Math.ceil(4.5);
        Math.floor(5.6);

        //随机数
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            System.out.print(random.nextInt(100)+" ");  //nextInt方法可以指定创建0 - x之内的随机数
        }
    }
}

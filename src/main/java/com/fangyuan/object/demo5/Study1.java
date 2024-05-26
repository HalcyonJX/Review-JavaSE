package com.fangyuan.object.demo5;

public interface Study1 {
    //接口中只能定义访问权限为public抽象方法，其中public和abstract关键字可以省略
    void study();
    default void test() {   //使用default关键字为接口中的方法添加默认实现
        System.out.println("我是默认实现");
    }
}
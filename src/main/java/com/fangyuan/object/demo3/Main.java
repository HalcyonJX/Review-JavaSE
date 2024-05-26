package com.fangyuan.object.demo3;

public class Main {
    public static void main(String[] args) {
        Person person = new Student("小明", 18, "男");    //这里使用父类类型的变量，去引用一个子类对象（向上转型）
        person.hello();    //父类对象的引用相当于当做父类来使用，只能访问父类对象的内容
    }
}

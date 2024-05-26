package com.fangyuan.object.demo6;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStatus(Status.RUNNING);
        System.out.println(student.getStatus().getName());
    }
}

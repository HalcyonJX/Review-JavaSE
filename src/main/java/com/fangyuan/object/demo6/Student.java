package com.fangyuan.object.demo6;

public class Student {

    public Status status;   //状态，可以是跑步、学习、睡觉这三个之中的其中一种

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
package com.example.designPattern.adapter;

public class MallardDuck implements Duck {

    public void fly() {
        System.out.println("날고있어요");
    }

    public void quack() {
        System.out.println("꽥!");
    }
}

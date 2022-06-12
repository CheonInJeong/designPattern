package com.example.designPattern.factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println(name + " 준비 중입니다.");
        System.out.println("도우를 돌리는 중...");
        System.out.println("소스를 뿌리는 중...");
        System.out.println("토핑을 올리는 중 : ");
        for(String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    public void bake() {
        System.out.println("주문 하신 " +name + "를 굽고 있습니다.");
    }
    public void cut() {
        System.out.println("주문 하신 " + name + "를 자르고 있습니다.");
    }
    public void box() {
        System.out.println("주문 하신 " + name + "를 상자에 담고 있습니다.");
    }

    public String getName() {
        return name;
    }
}

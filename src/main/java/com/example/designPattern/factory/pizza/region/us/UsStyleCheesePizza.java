package com.example.designPattern.factory.pizza.region.us;

import com.example.designPattern.factory.pizza.Pizza;

public class UsStyleCheesePizza extends Pizza {
    public UsStyleCheesePizza() {
        name = "미국 스타일 소스와 치즈 피자";
        dough = "두꺼운 크러스트 도우";
        sauce = "마리나라 소스";
        toppings.add("더블 치즈");
    }
}

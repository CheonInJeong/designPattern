package com.example.designPattern.factory.pizza.region.korea;

import com.example.designPattern.factory.pizza.Pizza;

public class KrStyleCheesePizza extends Pizza {
    public KrStyleCheesePizza() {
        name = "한국 스타일 소스와 치즈 피자";
        dough = "얇은 크러스트 도우";
        sauce = "마리나라 소스";
        toppings.add("불고기");
    }

}

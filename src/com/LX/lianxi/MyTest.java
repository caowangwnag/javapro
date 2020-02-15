package com.LX.lianxi;

public class MyTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.run();
        cat.run();
        dog.setAge(5);
        System.out.println(dog.getAge());
        cat.setName("小黑");
        System.out.println(cat.getName());
        cat.setShengying("喵喵喵");
        System.out.println(cat.getShengying());
    }
}

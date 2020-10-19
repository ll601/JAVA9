package com.company;
//汽车类
public class Car {
    String name;
    int wheel;
    public void info(){
        System.out.println("name："+name+"wheel:"+wheel);
    }
    public void show(){
        System.out.println("我是第一辆车");
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }*/
}

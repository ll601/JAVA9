package com.company;

public class Factory {

  public Car produceCar(){
      return new Car();
  }
  public Car produceCar(String n,int w){
      Car c = new Car();
      c.name=n;
      c.wheel=w;
      return c;
  }
  public void describeCar(Car c){
      c.info();
  }

}

package com.ivoyant;

public class Car {

    private Engine engine;

    public Car(){}
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        engine.start();
    }
}

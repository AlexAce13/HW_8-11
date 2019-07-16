package org.avivicourses.HomeWork8;

public class Car {
    private String model;
    private Body body;
    private Wheel wheel;
    private SteeringWheel steeringWheel;

    public Car(String model){
        this.model = model;
    }
    public void setBody(Body body){
        this.body = body;
    }
    public Body getBody(){
        return body;
    }

    public String getModel() {
        return model;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }
}

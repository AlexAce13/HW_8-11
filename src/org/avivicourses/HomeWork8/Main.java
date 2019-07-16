package org.avivicourses.HomeWork8;

public class Main {

    public static void main(String[] args) {
        carDrive();
    }

    public static void carDrive() {
        Car car1 = new Car("Audi");
        Body body = new Body("roadster");
        Wheel wheel = new Wheel(17,"summer");
        SteeringWheel steeringWheel = new SteeringWheel("sparco");
        car1.setBody(body);
        car1.setSteeringWheel(steeringWheel);
        car1.setWheel(wheel);

        System.out.print(String.format(
                "Car model: %s\nBody type: %s\nSteerin wheel manufactured by: %s\nWheels size: %s",
                car1.getModel().toString(),
                car1.getBody().toString(),
                car1.getSteeringWheel().toString(),
                car1.getWheel()).toString()
        );
    }

}

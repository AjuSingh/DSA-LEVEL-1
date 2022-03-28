package Oops.interfaces;

public class Main {
    public static void main(String[] args) {
        //now the car object has all methods of interfaces
        Car car = new Car();
        car.brake();
        car.start();
        car.stop();
        car.sound();
    }
}

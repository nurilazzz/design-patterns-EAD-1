package kz.abstractFactory.problem1;

import kz.abstractFactory.problem1.car.*;
import kz.abstractFactory.problem1.factory.*;
import kz.abstractFactory.problem1.values.*;

public class Main {

    public static void main(String[] args) {
	    CarFactory carFactory = CarFactory.getInstance();
        Car car = carFactory.buildCar(CarType.SEDAN);
        System.out.println(car.toString());
        Car car2 = carFactory.buildCar(CarType.LUXURY);
        System.out.println(car2.toString());
        car.setLocation(Location.ASIA);
        System.out.println(car.toString());
        Car car1 = new LuxuryCar(Location.USA);
        System.out.println(car1.toString());

    }
}

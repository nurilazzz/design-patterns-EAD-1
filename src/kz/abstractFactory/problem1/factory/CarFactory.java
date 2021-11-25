package kz.abstractFactory.problem1.factory;

import kz.abstractFactory.problem1.car.*;
import kz.abstractFactory.problem1.values.*;

public class CarFactory {
    private static CarFactory instance;
    private Car car;
    private Location location = chooseFactory();

    private CarFactory() {
    }

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory() {
            };
        }
        return instance;
    }

    public Car buildCar(CarType type) {
        if (location == Location.DEFAULT) {
            car = DefaultCarFactory.buildCar(type);
        } else if (location == Location.USA) {
            car = USACarFactory.buildCar(type);
        } else if (location == Location.ASIA) {
            car = AsiaCarFactory.buildCar(type);
        }
        return car;
    }

    private Location chooseFactory() {
        int factoryNumber = (int)(Math.random()*3)+1;
        if(factoryNumber == 1 ) {
            return Location.DEFAULT;
        }
        else if(factoryNumber == 2) {
            return Location.USA;
        }
        else if(factoryNumber == 3) {
            return  Location.ASIA;
        }
        return null;
    }

}

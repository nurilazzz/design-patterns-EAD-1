package kz.abstractFactory.problem1.car;

import kz.abstractFactory.problem1.values.CarType;
import kz.abstractFactory.problem1.values.Location;

public class SmallCar extends Car{

    public SmallCar(Location location) {
        super(CarType.SMALL, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Small car constructed");
    }
}

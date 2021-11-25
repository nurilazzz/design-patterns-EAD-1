package kz.abstractFactory.problem1.car;

import kz.abstractFactory.problem1.values.CarType;
import kz.abstractFactory.problem1.values.Location;

public class SedanCar extends Car{

    public SedanCar(Location location) {
        super(CarType.SEDAN, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Sedan car constructed");
    }
}

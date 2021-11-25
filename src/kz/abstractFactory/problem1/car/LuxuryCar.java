package kz.abstractFactory.problem1.car;

import kz.abstractFactory.problem1.factory.*;
import kz.abstractFactory.problem1.values.CarType;
import kz.abstractFactory.problem1.values.Location;

public class LuxuryCar extends Car{

    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Luxury car constructed");
    }
}

package kz.abstractFactory.problem1.factory;

import kz.abstractFactory.problem1.car.*;
import kz.abstractFactory.problem1.values.*;

public class AsiaCarFactory{
    public static Car buildCar(CarType model) {
        if(model == CarType.SMALL){
            return new SmallCar(Location.ASIA);
        } else if(model == CarType.SEDAN){
            return new SedanCar(Location.ASIA);
        }else if(model == CarType.LUXURY){
            return new LuxuryCar(Location.ASIA);
        }
        return null;
    }
}

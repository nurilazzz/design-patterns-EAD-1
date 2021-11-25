package kz.abstractFactory.problem1.factory;

import kz.abstractFactory.problem1.car.*;
import kz.abstractFactory.problem1.values.*;

public class DefaultCarFactory{
    public static Car buildCar(CarType model) {
        if(model == CarType.SMALL){
           return new SmallCar(Location.DEFAULT);
        } else if(model == CarType.SEDAN){
            return new SedanCar(Location.DEFAULT);
        }else if(model == CarType.LUXURY){
            return new LuxuryCar(Location.DEFAULT);
        }
        return null;
    }
}

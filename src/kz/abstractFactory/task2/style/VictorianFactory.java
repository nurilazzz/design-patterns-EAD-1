package kz.abstractFactory.task2.style;

import kz.abstractFactory.task2.furniture.chair.Chair;
import kz.abstractFactory.task2.furniture.chair.VictorianChair;
import kz.abstractFactory.task2.furniture.coffeeTable.CoffeeTable;
import kz.abstractFactory.task2.furniture.coffeeTable.VictorianCoffeeTable;
import kz.abstractFactory.task2.furniture.sofa.Sofa;
import kz.abstractFactory.task2.furniture.sofa.VictorianSofa;

public class VictorianFactory extends FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

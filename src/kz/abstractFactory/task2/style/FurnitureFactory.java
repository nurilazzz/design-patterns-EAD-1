package kz.abstractFactory.task2.style;

import kz.abstractFactory.task2.furniture.chair.Chair;
import kz.abstractFactory.task2.furniture.coffeeTable.CoffeeTable;
import kz.abstractFactory.task2.furniture.sofa.Sofa;

public abstract class FurnitureFactory {
    public abstract Chair createChair();
    public abstract CoffeeTable createCoffeeTable();
    public abstract Sofa createSofa();
}

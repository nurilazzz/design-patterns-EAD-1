package kz.abstractFactory.task2.style;

import kz.abstractFactory.task2.furniture.chair.Chair;
import kz.abstractFactory.task2.furniture.chair.ModernChair;
import kz.abstractFactory.task2.furniture.coffeeTable.CoffeeTable;
import kz.abstractFactory.task2.furniture.coffeeTable.ModernCoffeeTable;
import kz.abstractFactory.task2.furniture.sofa.ModernSofa;
import kz.abstractFactory.task2.furniture.sofa.Sofa;

public class ModernFactory extends FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

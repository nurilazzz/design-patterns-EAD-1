package kz.abstractFactory.task2.style;

import kz.abstractFactory.task2.furniture.chair.ArtDecoChair;
import kz.abstractFactory.task2.furniture.chair.Chair;
import kz.abstractFactory.task2.furniture.coffeeTable.ArtDecoCoffeeTable;
import kz.abstractFactory.task2.furniture.coffeeTable.CoffeeTable;
import kz.abstractFactory.task2.furniture.sofa.ArtDecoSofa;
import kz.abstractFactory.task2.furniture.sofa.Sofa;

public class ArtDecoFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}

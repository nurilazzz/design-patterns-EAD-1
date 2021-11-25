package kz.abstractFactory.task2;

import kz.abstractFactory.task2.furniture.chair.Chair;
import kz.abstractFactory.task2.furniture.coffeeTable.CoffeeTable;
import kz.abstractFactory.task2.furniture.sofa.Sofa;
import kz.abstractFactory.task2.style.FurnitureFactory;

public class Furniture {
    private Chair chair;
    private CoffeeTable coffeeTable;
    private Sofa sofa;
    public Furniture(FurnitureFactory abstractHeroFactory) {
        this.chair = abstractHeroFactory.createChair();
        this.coffeeTable =abstractHeroFactory.createCoffeeTable();
        this.sofa = abstractHeroFactory.createSofa();
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public CoffeeTable getCoffeeTable() {
        return coffeeTable;
    }

    public void setCoffeeTable(CoffeeTable coffeeTable) {
        this.coffeeTable = coffeeTable;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }
}

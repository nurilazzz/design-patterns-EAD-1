package kz.composite;

public class Product extends OrderObject {

    Product(String name, int price) {
        super(name, price);
    }

    @Override
    public void print() {
        System.out.println(getLevel() + "\"Product: " + getName() + "\"");
    }

    @Override
    public void add(OrderObject object) {
        System.out.println("LOG: you cannot lay something into THE PRODUCT");
    }
}

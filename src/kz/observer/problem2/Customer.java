package kz.observer.problem2;

import java.util.List;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void handleEvents(List<Product> products) {
        System.out.println(name + ", update on products: " + products
                + "\n------------------------------\n");
    }

}

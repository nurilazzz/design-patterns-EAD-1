package kz.observer.problem2;

import java.util.ArrayList;
import java.util.List;

public class TechStore implements Observed {
    private static Administrator admin = new Administrator();

    public final List<Product> products = new ArrayList<>();

    public final List<Customer> customers = new ArrayList<>();

    public void addProduct(Product product){
        this.products.add(product);
        notifyObservers();
    }

    public void removeProduct(Product product){
        this.products.remove(product);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.customers.add((Customer) observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.customers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: customers) {
            observer.handleEvents(this.products);
        }
    }
}

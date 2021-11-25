package kz.state;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<String, Integer> currencies; // "100tg" ~ 5  #it means we have 5 items each of them 100tg currency, TOTAL 500tg
                                             // 100tg 200tg 500tg 1000tg
    private ArrayList<Product> products;
    private Product selectedProduct;
    private int change = 0;
    private VendingMachineState state;

    VendingMachine(VendingMachineState state) {
        // Default
        currencies = new HashMap<>();
        products = new ArrayList<>();
        this.state = state;
    }

    public void listCurrencies(){
        if (currencies.isEmpty())
            System.out.println("Vending machine doesn't have a money");
        else {
            System.out.println("100tg: " + currencies.getOrDefault("100tg", 0));
            System.out.println("200tg: " + currencies.getOrDefault("200tg", 0));
            System.out.println("500tg: " + currencies.getOrDefault("500tg", 0));
            System.out.println("1000tg: " + currencies.getOrDefault("1000tg", 0));
        }
    }

    public void doNextStep(){
        state.nextStep(this);
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Map<String, Integer> getCurrencies() {
        return currencies;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public int getChange() {
        return change;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "currencies=" + currencies +
                ", products=" + products +
                ", state=" + state +
                '}';
    }
}
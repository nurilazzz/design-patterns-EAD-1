package kz.state;

public class Product {
    private String name;
    private int price;
    private int amount;

    Product(String name, int price){
        this.name = name;
        this.price = price;
        this.amount = 0;
    }

    Product(String name, int price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", price=" + price + "tg";
    }

    public String getInfo() {
        return "name='" + name + '\'' + ", price=" + price + "tg" + '\'' + ", amount=" + amount;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

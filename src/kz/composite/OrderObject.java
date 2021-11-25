package kz.composite;

public class OrderObject {
    private String name;
    private int price;
    private String level = "";

    OrderObject(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void print(){}
    public int getPrice(){return price;}
    public void add(OrderObject object){}
    public void remove(OrderObject object){}
    public void list(){}
    public OrderObject getObjectByName(String name) {return null;}
}

package kz.composite;

import java.util.ArrayList;

public class Box extends OrderObject {
    ArrayList<OrderObject> container = new ArrayList<>();

    Box(String name) {
        super(name, 0);
    }

    public OrderObject getObjectByName(String name) {
        OrderObject object = null;
        for (OrderObject item: container) {
            if (item.getName().equals(name))
                return item;
            object = item.getObjectByName(name);
            if (object != null)
                return object;
        }
        return object;
    }

    @Override
    public int getPrice() {
        int total = 0;
        for (OrderObject item: container) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public void add(OrderObject object) {
        container.add(object);
        object.setLevel(this.getLevel() + "\t");
    }

    @Override
    public void remove(OrderObject object) {
        if (container.remove(object)) {
            System.out.println("LOG: removed");
        } else {
            for (OrderObject item: container) {
                item.remove(object);
            }
        }
    }

    @Override
    public void print() {
        System.out.println(getLevel() + "\"Box: " + getName() + "\"");
    }

    @Override
    public void list() {
        if (!container.isEmpty()) {
            for (OrderObject item : container) {
                item.print();
                item.list();
            }
        }
    }
}

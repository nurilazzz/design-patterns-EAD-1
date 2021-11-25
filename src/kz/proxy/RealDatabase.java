package kz.proxy;

import java.util.LinkedHashSet;
import java.util.Set;

public class RealDatabase implements Database {
    private static Set<Product> products = new LinkedHashSet<>();

    static {
        products.add(new Product("Iphone 11", 20, "Cond is good"));
        products.add(new Product("Iphone 12", 10, "Cond is ggood"));
        products.add(new Product("Iphone 13 pro max", 8, "Cond is gggood"));
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }

    @Override
    public void delete(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    @Override
    public void getById(int id) {
        for (Product product : products) {
            if (id == product.getId()) {
                System.out.println(product.toString());
                break;
            }
            throw new ArrayIndexOutOfBoundsException("Product didn't find");
        }
    }

    public void getProducts(){
        products.forEach(System.out::println);
    }

//    private static RealDatabase database;
//    public static RealDatabase getInstance() {
//        if (database == null) {
//            database = new RealDatabase();
//        }
//        return database;
//    }
}

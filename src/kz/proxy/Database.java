package kz.proxy;

public interface Database {
    void create(Product product);

    void delete(int id);

    void getById(int id);

    void getProducts();
}

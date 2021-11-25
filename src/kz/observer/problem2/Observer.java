package kz.observer.problem2;

import java.util.List;

public interface Observer {
    void handleEvents(List<Product> products);
}

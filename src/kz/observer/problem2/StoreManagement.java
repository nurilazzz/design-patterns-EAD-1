package kz.observer.problem2;

public class StoreManagement {
    private static StoreManagement storeManagement = new StoreManagement();

    public static final TechStore techStore = new TechStore();

    private StoreManagement() {
    }

    static {
        techStore.addProduct(new Ipad(1L,"Ipad pro 2020",389990.0));
        techStore.addProduct(new Iphone(2L,"Iphone 13 pro 2021",669990.0));
        techStore.addProduct(new Macbook(3L,"Macbook pro 2019",278990.0));
        techStore.addProduct(new Ipad(4L,"Ipad 2018",156990.0));

        Observer customer1 = new Customer("Nurila");
        Observer customer2 = new Customer("Amir");
        Observer customer3 = new Customer("Bekassyl");

        techStore.addObserver(customer1);
        techStore.addObserver(customer2);
        techStore.addObserver(customer3);
    }

    public static StoreManagement getStoreManagementInstance(){
        return storeManagement;
    }
}

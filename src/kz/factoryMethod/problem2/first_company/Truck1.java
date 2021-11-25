package kz.factoryMethod.problem2.first_company;

public class Truck1 implements Transportation1 {
    private static final double COEF = 25;
    private static final double VELOCTY = 10;

    @Override
    public void transportation() {
        System.out.println("------>  Transportation by Truck");
    }

    @Override
    public double calculateDelivery(double distance) {
        return COEF *distance;
    }

    @Override
    public double calculateTime(double distance){
        return Math.round(distance / VELOCTY * 24);
    }
}

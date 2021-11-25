package kz.factoryMethod.problem2.second_company;

public class Truck2 implements Transportation2 {
    private static final double COEF = 2.3;
    private static final double VELOCITY = 70;
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
        return Math.round(distance / VELOCITY * 24);
    }
}

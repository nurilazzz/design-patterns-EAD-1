package kz.factoryMethod.problem2.first_company;

public class Ship1 implements Transportation1 {
    private static final double COEF = 100;
    private static final double VELOCITY = 50;

    @Override
    public void transportation() {
        System.out.println("------>  Transportation by Ship");
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

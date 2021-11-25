package kz.factoryMethod.problem2.second_company;

public class Ship2 implements Transportation2 {
    private static final double COEF = 650;
    private static final double VELOCITY = 60;
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

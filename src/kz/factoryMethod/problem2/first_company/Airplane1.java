package kz.factoryMethod.problem2.first_company;

public class Airplane1 implements Transportation1 {
    private static final double COEF = 1200;
    private static final double VELOCITY = 200;
    @Override
    public void transportation() {
        System.out.println("------>  Transportation by Airplane");
    }

    @Override
    public double calculateDelivery(double distance) {
        return COEF*distance;
    }

    @Override
    public double calculateTime(double distance){
        return Math.round(distance / VELOCITY * 24);
    }
}

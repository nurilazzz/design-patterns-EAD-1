package kz.strategy.problem2.strategies;

import kz.strategy.problem2.TravellingStrategy;

public class PlaneTravellingStrategy implements TravellingStrategy {
    @Override
    public void travel() {
        System.out.println("I am travelling by plane");
    }
}

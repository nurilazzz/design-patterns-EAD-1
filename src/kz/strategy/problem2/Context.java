package kz.strategy.problem2;

public class Context {
    private TravellingStrategy travellingStrategy;

    public void setTravellingStrategy(TravellingStrategy travellingStrategy) {
        this.travellingStrategy = travellingStrategy;
    }

    public void travel() {
        travellingStrategy.travel();
    }
}

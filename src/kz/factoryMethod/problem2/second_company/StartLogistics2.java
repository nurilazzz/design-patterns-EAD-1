package kz.factoryMethod.problem2.second_company;

public class StartLogistics2 {

    public static Transportation2 getTransportation(TransportType2 transportType2) {

        switch (transportType2) {
            case TRUCK:
                return new Truck2();
            case SHIP:
                return new Ship2();
        }
        return null;
    }
}

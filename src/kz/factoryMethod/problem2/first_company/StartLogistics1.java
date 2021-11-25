package kz.factoryMethod.problem2.first_company;

public class StartLogistics1 {

    public static Transportation1 getTransportation(TransportType1 transportType1) {

        switch (transportType1) {
            case TRUCK:
                return new Truck1();
            case SHIP:
                return new Ship1();
            case AIRPLANE:
                return new Airplane1();
        }
        return null;
    }
}

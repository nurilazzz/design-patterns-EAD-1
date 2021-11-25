package kz.facade.subsystems.transport;

import kz.facade.additionalClasses.LoadingAnimation;

public class TruckTransport implements TransportCenterSystem{
    @Override
    public void deliverToSortingCenter() {
        LoadingAnimation.animate("Truck transportation");
    }
}
